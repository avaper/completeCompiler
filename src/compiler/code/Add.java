package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Add extends Translator
{		
	public Add(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{		
		b.append(tab + "ADD " + op1 + ", " + op2 + endl);
		b.append(tab + "MOVE " + A + ", " + res + endl);
		
		return b.toString();
	}
}
