package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;
import es.uned.lsi.compiler.intermediate.TemporalIF;
import es.uned.lsi.compiler.syntax.nonTerminal.NonTerminalIF;

/**
 * Abstract class for non terminals.
 */
public abstract class NonTerminal
    implements NonTerminalIF
{
	private TemporalIF temporal;
    private List<QuadrupleIF> intermediateCode;
    
    /**
     * Constructor for NonTerminal.
     */
    public NonTerminal ()
    {
        super ();
        this.intermediateCode = new ArrayList<QuadrupleIF> ();
    }

    /**
     * Returns the intermediateCode.
     * @return Returns the intermediateCode.
     */
    public List<QuadrupleIF> getIntermediateCode ()
    {
        return intermediateCode;
    }

    /**
     * Sets The intermediateCode.
     * @param intermediateCode The intermediateCode to set.
     */
    public void setIntermediateCode (List<QuadrupleIF> intermediateCode)
    {
        this.intermediateCode = intermediateCode;
    }

	/**
	 * @return the temporal
	 */
	public TemporalIF getTemporal() {
		return temporal;
	}

	/**
	 * @param temporal the temporal to set
	 */
	public void setTemporal(TemporalIF temporal) {
		this.temporal = temporal;
	}
    
}