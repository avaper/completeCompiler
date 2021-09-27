package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class InL extends Translator
{
	public InL(QuadrupleIF quadruple)
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{	
		b.append(res + ":" + endl);
		b.append(tab + "NOP" + endl);
		
		return b.toString();
	}
}
