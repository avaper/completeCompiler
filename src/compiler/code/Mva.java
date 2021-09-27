package compiler.code;

import compiler.intermediate.Temporal;
import compiler.intermediate.Variable;
import compiler.semantic.symbol.SymbolParameter;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Mva extends Translator
{
	public Mva(QuadrupleIF quadruple) 
	{
		super(quadruple);
	}

	public String translate(QuadrupleIF quadruple) 
	{
		Variable var = ((Variable) quadruple.getFirstOperand());
		Temporal temp = ((Temporal) quadruple.getResult());
		
		// Globales
		
		if ( var.isGlobal() )
		{			
			b.append(tab + "SUB " + "/" + MAX_ADDRESS + ", " + "#" + var.getAddress() + endl);
			b.append(tab + "MOVE " + A + ", " + res + endl);
		}
		
		// Locales
		
		else if ( var.getScope().getLevel() == temp.getScope().getLevel() )
		{	
			if ( var.getScope().getSymbolTable().getSymbol(var.getName()) instanceof SymbolParameter )
			{		
				b.append(tab + "SUB " + IX + ", " + "#" + var.getAddress() + endl);
				b.append(tab + "MOVE " + address_A + ", " + res + endl);
			}
			else 
			{    				
				b.append(tab + "SUB " + IX + ", " + "#" + var.getAddress() + endl);
				b.append(tab + "MOVE " + A + ", " + res + endl);
			}
		}
		
		// No locales
		
		else
		{
			if ( var.getScope().getSymbolTable().getSymbol(var.getName()) instanceof SymbolParameter )
			{
				int display = MAX_ADDRESS - var.getScope().getLevel();
				
				b.append(tab + "SUB " + "/" + display + ", " + "#" + var.getAddress() + endl);
				b.append(tab + "MOVE " + address_A + ", " + res + endl);
			}
			else
			{    				
				int display = MAX_ADDRESS - var.getScope().getLevel();
				
				b.append(tab + "SUB " + "/" + display + ", " + "#" + var.getAddress() + endl);
				b.append(tab + "MOVE " + A + ", " + res + endl);
			}
		}
		
		return b.toString();
	}
}
