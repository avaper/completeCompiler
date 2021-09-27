package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class ReturnValue extends Translator
{
	public ReturnValue(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{	
		b.append(tab + "MOVE " + R_9 + ", " + res + endl);
		
		return b.toString();
	}
}
