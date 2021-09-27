package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class SubRoutinePointer extends Translator
{
	public SubRoutinePointer(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{	
		b.append(tab + "SUB " + IX + ", " + op1 + endl);
		b.append(tab + "MOVE " + A + ", " + SP + endl);
		
		return b.toString();
	}
}
