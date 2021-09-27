package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class StringData extends Translator
{
	public StringData(QuadrupleIF quadruple)
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{
		b.append(tab + op1 + ": DATA " + res + endl);
		
		return b.toString();
	}
}
