package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class WriteInt extends Translator
{
	public WriteInt(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{	
		b.append(tab + "WRINT " + res + endl);
		b.append(tab + "WRCHAR #10" + endl);
		
		return b.toString();
	}
}
