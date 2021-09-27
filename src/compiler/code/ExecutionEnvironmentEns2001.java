package compiler.code;

import java.util.Arrays;
import java.util.List;

import compiler.semantic.type.TypeSimple;

import es.uned.lsi.compiler.code.ExecutionEnvironmentIF;
import es.uned.lsi.compiler.code.MemoryDescriptorIF;
import es.uned.lsi.compiler.code.RegisterDescriptorIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

/**
 * Class for the ENS2001 Execution environment.
 */

public class ExecutionEnvironmentEns2001 
    implements ExecutionEnvironmentIF
{   
	
    private final static int      MAX_ADDRESS = 65535; 
    private final static String[] REGISTERS   = {
       ".PC", ".SP", ".SR", ".IX", ".IY", ".A", 
       ".R0", ".R1", ".R2", ".R3", ".R4", 
       ".R5", ".R6", ".R7", ".R8", ".R9"
    };
    
    private RegisterDescriptorIF registerDescriptor;
    private MemoryDescriptorIF   memoryDescriptor;
    
    
    
    /**
     * Constructor for ENS2001Environment.
     */
    public ExecutionEnvironmentEns2001 ()
    {       
        super ();
    }
    
    /**
     * Returns the size of the type within the architecture.
     * @return the size of the type within the architecture.
     */
    @Override
    public final int getTypeSize (TypeSimple type)
    {      
        return 1;  
    }
    
    /**
     * Returns the registers.
     * @return the registers.
     */
    @Override
    public final List<String> getRegisters ()
    {
        return Arrays.asList (REGISTERS);
    }
    
    /**
     * Returns the memory size.
     * @return the memory size.
     */
    @Override
    public final int getMemorySize ()
    {
        return MAX_ADDRESS;
    }
           
    /**
     * Returns the registerDescriptor.
     * @return Returns the registerDescriptor.
     */
    @Override
    public final RegisterDescriptorIF getRegisterDescriptor ()
    {
        return registerDescriptor;
    }

    /**
     * Returns the memoryDescriptor.
     * @return Returns the memoryDescriptor.
     */
    @Override
    public final MemoryDescriptorIF getMemoryDescriptor ()
    {
        return memoryDescriptor;
    }

    /**
     * Translate a quadruple into a set of final code instructions. 
     * @param cuadruple The quadruple to be translated.
     * @return a quadruple into a set of final code instructions. 
     */
    @Override
    public final String translate (QuadrupleIF quadruple)
    {	
		switch (quadruple.getOperation()) 
		{
			case "DISPLAY":
				Display display = new Display(quadruple);		
				return display.translate(quadruple);
		    	
	    	case "DATA":
	    		Data data = new Data(quadruple);
	    		return data.translate(quadruple);
	    	
	    	case "GLOBALPOINTER":
	    		GlobalPointer globalPointer = new GlobalPointer(quadruple);
	    		return globalPointer.translate(quadruple);
	    	
	    	case "GLOBALVARIABLE":
	    		GlobalVariable globalVariable = new GlobalVariable(quadruple);
	    		return globalVariable.translate(quadruple);
	 
	    	case "ENTER":
	    		Enter enter = new Enter(quadruple);
	    		return enter.translate(quadruple);
	    	
	    	case "SUBROUTINEPOINTER":
	    		SubRoutinePointer subRoutinePointer = new SubRoutinePointer(quadruple);
	    		return subRoutinePointer.translate(quadruple);
	    	
	    	case "SUBROUTINEVARIABLE":
	    		SubRoutineVariable subRoutineVariable = new SubRoutineVariable(quadruple);
	    		return subRoutineVariable.translate(quadruple);
	    	
	    	case "PARAM":
	    		Param param = new Param(quadruple);
	    		return param.translate(quadruple);
	 
	    	case "CALL":
	    		Call call = new Call(quadruple);
	    		return call.translate(quadruple);

	    	case "SUBROUTINE":
	    		SubRoutine subRoutine = new SubRoutine(quadruple);
	    		return subRoutine.translate(quadruple);
	    		
	    	case "LEAVE":
	    		Leave leave = new Leave(quadruple);
	    		return leave.translate(quadruple);

	    	case "RETURNVALUE":
	    		ReturnValue returnValue = new ReturnValue(quadruple);
	    		return returnValue.translate(quadruple);
	    	
	    	case "RET":
	    		Ret ret = new Ret(quadruple);
	    		return ret.translate(quadruple);
	  	
	    	case "MV":
	    		Mv mv = new Mv(quadruple);
	    		return mv.translate(quadruple);
	       
	    	case "MVA":
	    		Mva mva = new Mva(quadruple);
	    		return mva.translate(quadruple);
	    	
	    	case "MVP":
	    		Mvp mvp = new Mvp(quadruple);
	    		return mvp.translate(quadruple);
	    	
	    	case "STP":
	    		Stp stp = new Stp(quadruple);
	    		return stp.translate(quadruple);
	  	
	    	case "NOT":
	    		Not not = new Not(quadruple);
	    		return not.translate(quadruple);
	    	
	    	case "DIV":
	    		Div div = new Div(quadruple);
	    		return div.translate(quadruple);
	    	
	    	case "ADD":
	    		Add add = new Add(quadruple);
	    		return add.translate(quadruple);
	    	
	    	case "SUB":
	    		Sub sub = new Sub(quadruple);
	    		return sub.translate(quadruple);

	    	case "AND":
	    		And and = new And(quadruple);
	    		return and.translate(quadruple);

	    	case "LS":
	    		Ls ls = new Ls(quadruple);
	    		return ls.translate(quadruple);
	    	
	    	case "NEQ":
	    		Neq neq = new Neq(quadruple);
	    		return neq.translate(quadruple);
	  	
	    	case "INL":
	    		InL inl = new InL(quadruple);
	    		return inl.translate(quadruple);
	    	
	    	case "BR":
	    		Br br = new Br(quadruple);
	    		return br.translate(quadruple);
	    	
	    	case "BRF":
	    		BrF brf = new BrF(quadruple);
	    		return brf.translate(quadruple);
	    	
	    	case "WRITESTR":
	    		WriteStr writeStr = new WriteStr(quadruple);
	    		return writeStr.translate(quadruple);
	    	
	    	case "WRITEINT":
	    		WriteInt writeInt = new WriteInt(quadruple);
	    		return writeInt.translate(quadruple);
	    	
	    	case "WRITELN":
	    		WriteLn writeLn = new WriteLn(quadruple);
	    		return writeLn.translate(quadruple);
	    	
	    	case "HALT":
	    		Halt halt = new Halt(quadruple);
	    		return halt.translate(quadruple);
	    		
	    	case "STRINGDATA":
	    		StringData stringData = new StringData(quadruple);
	    		return stringData.translate(quadruple);
		    	
			default:
				return null;
		}
    }
}
