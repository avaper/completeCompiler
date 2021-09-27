package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Sub extends Translator
{
	public Sub(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{	
		b.append(tab + "SUB " + op1 + ", " + op2 + endl);
		b.append(tab + "MOVE " + A + ", " + res + endl);
		
		return b.toString();
	}
}
