package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class WriteLn extends Translator
{
	public WriteLn(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{	
		b.append(tab + "WRCHAR #10" + endl);
		
		return b.toString();
	}
}
