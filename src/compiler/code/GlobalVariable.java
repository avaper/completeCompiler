package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class GlobalVariable extends Translator
{
	public GlobalVariable(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{	
		b.append(tab + "PUSH " + "#0" + endl);
		
		return b.toString();
	}
}
