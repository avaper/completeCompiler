package compiler.code;

import compiler.intermediate.Label;
import compiler.intermediate.Temporal;
import compiler.intermediate.Value;
import compiler.intermediate.Variable;
import es.uned.lsi.compiler.intermediate.LabelFactory;
import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class Translator 
{
	protected static int MAX_ADDRESS = 65535;
	
	LabelFactory lf = new LabelFactory();
	
	protected String tab = "\t\t";
	protected String endl = "\n";
	
	protected String  A =  ".A";
	protected String SR = ".SR";
	protected String SP = ".SP";
	protected String IX = ".IX";
		
	protected String R_0 = ".R0";
	protected String R_1 = ".R1";
	protected String R_2 = ".R2";
	protected String R_3 = ".R3";
	protected String R_9 = ".R9";
	
	protected String address_A 		= "[.A]";
	protected String address_IX		= "[.IX]";	
	protected String address_R_1	= "[.R1]";
	protected String address_R_2	= "[.R2]";
	protected String address_R_3	= "[.R3]";
	
	protected String returnValue 	= "#-0[.IX]";
	protected String controlLink 	= "#-1[.IX]";
	protected String stateRegister  = "#-2[.IX]";
	protected String accessLink  	= "#-3[.IX]";
		
	protected String op1;
	protected String op2;
	protected String res;
	
	protected StringBuffer b;

	public Translator(QuadrupleIF quadruple) 
	{
		b = new StringBuffer();
		
		b.append(tab + ";" + quadruple.toString() + endl);
		
		op1 = this.translate(quadruple.getFirstOperand());
		op2 = this.translate(quadruple.getSecondOperand());
		res = this.translate(quadruple.getResult());
	}
	
    /**
     * 
     * @param operand
     * @return
     */
    private String translate (OperandIF operand)
    {   	
		if ( operand instanceof Variable )
		{				
			return "#-" + (((Variable) operand).getAddress()) + address_IX;
		}

		if ( operand instanceof Value )
		{
			return "#" + ((Value) operand).getValue();
		}
		
		if ( operand instanceof Label )
		{
			return ((Label) operand).getName();
		}
		
		if ( operand instanceof Temporal )
		{
			return "#-" + ((Temporal) operand).getAddress() + address_IX;
		}
		
    	return null;
    }
}
