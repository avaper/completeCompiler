package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Halt extends Translator
{
	public Halt(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{
		b.append(tab + "HALT" + endl);
		
		return b.toString();
	}
}
