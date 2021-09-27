package compiler.intermediate;

import compiler.semantic.symbol.SymbolParameter;
import compiler.semantic.symbol.SymbolVariable;
import compiler.semantic.type.TypeRecord;
import es.uned.lsi.compiler.intermediate.VariableIF;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolIF;

/**
 * Class for variables in intermediate code.
 */

public class Variable
    implements VariableIF 
{
    private String  name     = null;
    private ScopeIF scope    = null;
    private int offset = 0;
        
    /**
     * Constructor for Variable.
     * @param name The name.
     * @param scope The scope index.
     */
    public Variable (String name, ScopeIF scope)
    {
        super ();
        this.name = name;
        this.scope = scope;
    }
    
    /**
     * 
     * @param name
     * @param scope
     * @param offset
     */
    public Variable (String name, ScopeIF scope, int offset)
    {
        this(name, scope);
        this.offset = offset;
    }

    /**
     * Returns the name.
     * @return Returns the name.
     */
    @Override
    public final String getName ()
    {
        return name;
    }

    /**
     * Returns the scope.
     * @return Returns the scope.
     */
    @Override
    public final ScopeIF getScope ()
    {
        return scope;
    }

    /**
     * Returns the address.
     * @return Returns the address.
     */
    @Override
    public final int getAddress ()
    {
        // TODO : Student Work
    	
    	String varName = this.name;
    	
    	if ( varName.contains("_") )
    	{
    		varName = varName.substring(varName.indexOf("_") + 1);
    		
    		for (SymbolIF symbol : this.scope.getSymbolTable().getSymbols()) 
    		{
    			if ( symbol.getType() instanceof TypeRecord )
    			{				
    				if ( ((TypeRecord) symbol.getType()).containsField(varName) )
    				{		
    					if ( symbol instanceof SymbolParameter ) 
    					{
    						return ((SymbolParameter) scope.getSymbolTable().getSymbol(symbol.getName())).getAddress() - ((TypeRecord) symbol.getType()).getFieldPosition(varName);
    					}
    					else
    					{
    						return ((SymbolVariable) scope.getSymbolTable().getSymbol(symbol.getName())).getAddress() - ((TypeRecord) symbol.getType()).getFieldPosition(varName);
    					}
    				}
    			}
    		}
    	} 
    	
    	if ( scope.getSymbolTable().getSymbol(varName) instanceof SymbolParameter )
    	{    		
    		return ((SymbolParameter) scope.getSymbolTable().getSymbol(varName)).getAddress();
    	}
    	else
    	{
    		return ((SymbolVariable) scope.getSymbolTable().getSymbol(varName)).getAddress();
    	}
    }

    /**
     * Indicates whether the address is a global address.
     * @return true if the address is a global address.
     */
    @Override
    public final boolean isGlobal ()
    {
        // TODO : Student Work
        return this.scope.getLevel() == 0;
    }

    /**
     * Compares this object with another one.
     * @param other the other object.
     * @return true if both objects has the same properties.
     */
    @Override
    public final boolean equals (Object other)
    {
        if (other == null) 
        {
            return false;
        }
        if (this == other)
        {
            return true;
        }
        if (!(other instanceof Variable))
        {
            return false;
        }
        
        final Variable aVariable = (Variable) other;
        return ((scope   == null) ? (aVariable.scope == null) : (aVariable.scope.equals (scope))) && 
               ((name    == null) ? (aVariable.name  == null) : (aVariable.name.equals (name)));
    }

    /**
     * Returns a hash code for the object.
     */
    @Override
    public final int hashCode ()
    {
        return 31 * scope.hashCode() +
                  ((name == null)? 0 : name.hashCode ());
    } 

    /**
     * Return a string representing the object.
     * @return a string representing the object.
     */
    @Override
    public final String toString ()
    {    
        return name;
    }

	/**
	 * @return the offset
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * @param offset the offset to set
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}
}
