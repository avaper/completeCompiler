package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class GlobalPointer extends Translator
{
	public GlobalPointer(QuadrupleIF quadruple)
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{
		b.append(tab + "SUB " + IX + ", " + op1 + endl);
		b.append(tab + "MOVE " + A + ", " + SP + endl);
		
		return b.toString();
	}
}
