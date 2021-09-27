package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Data extends Translator
{
	public Data(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{		
		b.append(tab + "MOVE " + SP + ", " + IX + endl);
		
		// Valor de retorno
		b.append(tab + "PUSH " + SP + endl);
		
		// Enlace de control
		b.append(tab + "PUSH " + IX + endl);
		
		// Estado de la maquina
		b.append(tab + "PUSH " + SR + endl);
		
		// Enlace de acceso
		b.append(tab + "PUSH " + IX + endl);
		
		// DISPLAY
		b.append(tab + "MOVE " + IX  + ", " + "/" + MAX_ADDRESS + endl);
		
		return b.toString();
	}
}
