package compiler.semantic.type;

import java.util.ArrayList;
import java.util.List;

import compiler.semantic.symbol.SymbolParameter;
import compiler.syntax.nonTerminal.VarSeqDeIds;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

/**
 * Class for TypeProcedure.
 */

// TODO: Student work
//       Include properties to characterize procedure declarations

public class TypeProcedure
    extends TypeBase
{   
	private List<SymbolParameter> parameters;
	
   /**
     * Constructor for TypeProcedure.
     * @param scope The declaration scope.
     */
    public TypeProcedure (ScopeIF scope)
    {
        super(scope);
        this.parameters = new ArrayList<SymbolParameter>();
    }

    /**
     * 
     * @param scope
     * @param name
     */
    public TypeProcedure (ScopeIF scope, String name)
    {
        this(scope);
        this.setName(name);
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
