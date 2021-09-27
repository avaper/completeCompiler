package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class SubRoutine extends Translator
{
	public SubRoutine(QuadrupleIF quadruple) 
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
