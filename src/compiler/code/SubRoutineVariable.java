package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class SubRoutineVariable extends Translator
{
	public SubRoutineVariable(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{	
		b.append(tab + "PUSH " + "#0" + endl);
		
		return b.toString();
	}
}
