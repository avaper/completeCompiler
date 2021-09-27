package compiler.code;

import compiler.intermediate.Label;
import compiler.semantic.type.TypeFunction;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Call extends Translator
{

	public Call(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{		
  		int display = MAX_ADDRESS - (((Label) quadruple.getResult()).getType().getScope().getLevel() + 1);

		// Guarda el valor RO en IX
		b.append(tab + "MOVE " + R_0 + ", " + IX + endl);

	    // DISPLAY
	    b.append(tab + "MOVE " + "/" + display + ", " + accessLink + endl);					
	    b.append(tab + "MOVE " + IX  + ", " + "/" + display + endl);		    
	    
		// PUSHea el Contador de programa  y salta
		b.append(tab + "CALL " + "/" + res + endl);			

	    // DISPLAY
	    b.append(tab + "MOVE " + accessLink  + ", " + "/" + display + endl);
		
		// Puntero de Pila
		b.append(tab + "MOVE " + IX + ", " + SP + endl);

		// Valor de retorno
		if ( ((Label) quadruple.getResult()).getType() instanceof TypeFunction ) 
		{
			b.append(tab + "MOVE " + returnValue + ", " + R_9 + endl);    			
		}	
		
		// Enlace de control (para recuperar el registro indice)
		b.append(tab + "MOVE " + controlLink + ", " + R_0 + endl);
	
		// Actualiza el registro indice para la funcion main
		b.append(tab + "MOVE " + R_0 + ", " + IX + endl);
		
		return b.toString();
	}
}
