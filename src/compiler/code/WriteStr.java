package compiler.code;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class WriteStr extends Translator
{
	public WriteStr(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{	
		b.append(tab + "WRSTR " + "/" + op1 + endl);
		b.append(tab + "WRCHAR #10" + endl);
		
		return b.toString();
	}
}
