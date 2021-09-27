package compiler.semantic.type;

import java.util.ArrayList;
import java.util.List;

import compiler.semantic.symbol.SymbolParameter;
import compiler.syntax.nonTerminal.VarSeqDeIds;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for TypeFunction.
 */

// TODO: Student work
//       Include properties to characterize function declarations

public class TypeFunction
    extends TypeProcedure
{   
	private TypeIF returnType;
	private List<SymbolParameter> parameters;
	
    /**
     * Constructor for TypeFunction.
     * @param scope The declaration scope.
     */
    public TypeFunction (ScopeIF scope)
    {
        super(scope);
        this.parameters = new ArrayList<SymbolParameter>();
    }
    
    /**
     * 
     * @param scope
     * @param name
     * @param returnType
     */
    public TypeFunction (ScopeIF scope, String name, TypeIF returnType)
    {
        this(scope);
        this.setName(name);
        this.setReturnType(returnType);
    }

	/**
	 * @return the returnType
	 */
	public TypeIF getReturnType() 
	{
		return returnType;
	}

	/**
	 * @param returnType the returnType to set
	 */
	public void setReturnType(TypeIF returnType) 
	{
		this.returnType = returnType;
	}
	
    /**
     * Returns the size of the type.
     * @return the size of the type.
     */
    @Override
    public int getSize ()
    {
        // TODO: Student work
    	
    	int size = 1;
    	
    	for (SymbolParameter param : parameters) 
    	{
			size += param.getType().getSize();
		}
    	
        return size;
    }

	/**
	 * @return the parameters
	 */
	public List<SymbolParameter> getParameters() 
	{
		return parameters;
	}

	/**
	 * @param parameters the parameters to set
	 */
	public void setParameters(List<SymbolParameter> parameters) 
	{
		this.parameters = parameters;
	}
    
	/**
	 * 
	 * @param s
	 */
	public void addParameter(SymbolParameter param) 
	{
		this.parameters.add(this.parameters.size(), param);
	}
	
	/**
	 * 
	 * @param l
	 */
	public void addAllParameters(List<SymbolParameter> params) 
	{
		this.parameters.addAll(this.parameters.size(), params);
	}
	
	/**
	 * 
	 * @param lista
	 */
	public void addParamSeq(List<VarSeqDeIds> lista, ScopeIF newScope)
	{
		for ( VarSeqDeIds paramSeq: lista )
		{
			for ( String parID: paramSeq.getIDs() )
			{					
				this.addParameter(new SymbolParameter(newScope, parID.toUpperCase(), paramSeq.getType()));
			}
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public int getNumParams() 
	{	
		return this.getParameters().size();
	}
}
