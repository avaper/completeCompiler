package compiler.code;

import compiler.intermediate.Value;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Display extends Translator
{		
	public Display(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple)
	{		
		int display = Integer.parseInt(((Value) quadruple.getResult()).getValue().toString());
		
		b.append(tab + "PUSH " + "#" + 0 + endl);

		for (int i = 0; i < display; i++) 
		{				
			b.append(tab + "PUSH " + "#" + 0 + endl);
		}
		
		return b.toString();
	}
}
