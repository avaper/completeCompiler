package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class BrF extends Translator
{
	public BrF(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{			
		b.append(tab + "CMP " + res + ", " + "#0" + endl);
		b.append(tab + "BZ " + "/" + op1 + endl);
		
		return b.toString();
	}
}
