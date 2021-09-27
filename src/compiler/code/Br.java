package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Br extends Translator
{
	public Br(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{		
		b.append(tab + "BR " + "/" + res + endl);
		
		return b.toString();
	}
}
