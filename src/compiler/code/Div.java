package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Div extends Translator
{
	public Div(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{
		b.append(tab + "DIV " + op1 + ", " + op2 + endl);
		b.append(tab + "MOVE " + A + ", " + res + endl);
		
		return b.toString();
	}
}
