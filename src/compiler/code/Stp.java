package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Stp extends Translator
{
	public Stp(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{	
 		b.append(tab + "MOVE " + res + ", " + R_2 + endl);
		b.append(tab + "MOVE " + op1 + ", " + address_R_2 + endl);
		
		return b.toString();
	}
}
