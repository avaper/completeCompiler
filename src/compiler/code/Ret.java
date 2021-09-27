package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Ret extends Translator
{
	public Ret(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{
		b.append(tab + "MOVE " + op1 + ", " + returnValue + endl);
		b.append(tab + "BR " + "/" + res + endl);
		
		return b.toString();
	}
}
