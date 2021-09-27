package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Enter extends Translator
{
	public Enter(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{
		// Guardamos en R0 el valor ACTUAL del Puntero de Pila
		b.append(tab + "MOVE " + SP + ", " + R_0 + endl);
		
		// Valor de Retorno (marco actual)
		b.append(tab + "PUSH " + IX + endl);

		// Enlace de Control (Puntero de pila al comienzo)
		b.append(tab + "PUSH " + IX + endl);
		
		// Estado de la maquina
		b.append(tab + "PUSH " + SR + endl);
		
		// Enlace de Acceso
		b.append(tab + "PUSH " + IX + endl);
		
		return b.toString();
	}
}
