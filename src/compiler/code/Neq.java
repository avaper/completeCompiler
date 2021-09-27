package compiler.code;

import es.uned.lsi.compiler.intermediate.LabelIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Neq extends Translator
{
	public Neq(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{	
		LabelIF labelTrue = lf.create();
		LabelIF labelFalse = lf.create();
		
		b.append(tab + "CMP " + op1 + ", " + op2 + endl);    		
		b.append(tab + "MOVE " + "#0" + ", " + res + endl);
		b.append(tab + "BNZ " + "/" + labelTrue + endl);
		b.append(tab + "BR " + "/" + labelFalse + endl);  
		b.append(tab + labelTrue + ":\n");
		b.append(tab + "\tMOVE " + "#1" + ", " + res + endl);
		b.append(tab + labelFalse + ":" + endl);
		b.append(tab + "\tNOP" + endl);
		
		return b.toString();
	}
}
