package compiler.syntax.nonTerminal;

import java.util.List;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;
import es.uned.lsi.compiler.intermediate.TemporalIF;

public class AxiomImpl extends Axiom
{
	/**
	 * 
	 */
    public AxiomImpl ()
    {
        super (); 
    }

	@Override
	public List<QuadrupleIF> getIntermediateCode() {
		// TODO Auto-generated method stub
		return super.getIntermediateCode();
	}

	@Override
	public void setIntermediateCode(List<QuadrupleIF> intermediateCode) {
		// TODO Auto-generated method stub
		super.setIntermediateCode(intermediateCode);
	}

	@Override
	public TemporalIF getTemporal() {
		// TODO Auto-generated method stub
		return super.getTemporal();
	}

	@Override
	public void setTemporal(TemporalIF temporal) {
		// TODO Auto-generated method stub
		super.setTemporal(temporal);
	}
}
