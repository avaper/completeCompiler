package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Param extends Translator
{
	public Param(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{	
		b.append(tab + "PUSH " + res + endl);
		
		return b.toString();
	}
}
