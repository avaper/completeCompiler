package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Mv extends Translator
{
	public Mv(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{
		b.append(tab + "MOVE " + op1 + ", " + res + endl);
		
		return b.toString();
	}
}
