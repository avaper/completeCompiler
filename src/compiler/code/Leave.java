package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Leave extends Translator
{
	public Leave(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{
		b.append(res + ":" + endl);
		
		b.append(tab + "SUB " + R_0 + ", " + op1 + endl);
		
		b.append(tab + "MOVE " + A + ", " + SP + endl);

		// POPea el contenido del Contador de Programa
		b.append(tab + "RET" + endl);
		
		return b.toString();
	}
}
