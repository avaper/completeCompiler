package compiler.code;

import es.uned.lsi.compiler.intermediate.LabelIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Not extends Translator
{
	public Not(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{	
		b.append(tab + "CMP " + "#0" + ", " + op1 + endl);
		
		LabelIF labelTrue = lf.create();
		LabelIF labelFalse = lf.create();
		
		b.append(tab + "MOVE " + "#0" + ", " + res + endl);
		b.append(tab + "BZ " + "/" + labelTrue + endl);
		b.append(tab + "BR " + "/" + labelFalse + endl);  
		b.append(tab + labelTrue + ":" + endl);
		b.append(tab + "\tMOVE " + "#1" + ", " + res + endl);
		b.append(tab + labelFalse + ":" + endl);
		b.append(tab + "\tNOP" + endl);
		
		return b.toString();
	}
}
