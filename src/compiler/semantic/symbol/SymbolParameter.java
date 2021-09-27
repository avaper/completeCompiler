package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolVariable.
 */

// TODO: Student work
//       Include properties to characterize parameters

public class SymbolParameter
    extends SymbolBase
{  
	private int address = 0;
	private int position = 0;
	
    /**
     * Constructor for SymbolParameter.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolParameter (ScopeIF scope, 
                           String name,
                           TypeIF type)
    {
        super (scope, name, type);
    }

	/**
	 * @return the address
	 */
	public int getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(int address) {
		this.address = address;
	}

	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}
}
