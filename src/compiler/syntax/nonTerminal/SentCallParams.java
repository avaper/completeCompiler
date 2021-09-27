package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

import compiler.semantic.symbol.SymbolParameter;

public class SentCallParams extends NonTerminal 
{
	private List<SymbolParameter> params = null;

	/**
	 * 
	 */
	public SentCallParams() 
	{
		super();
		this.params = new ArrayList<SymbolParameter>();
	}

	/**
	 * @param expressions
	 */
	public SentCallParams(List<SymbolParameter> params) 
	{
		this();
		this.params = params;
	}

	public SentCallParams(SymbolParameter param) 
	{
		this();
		this.params.add(param);
	}
	
	/**
	 * 
	 * @param s
	 */
	public SentCallParams(SentCallParams s) 
	{
		this();
		this.params = s.getParams();
	}

	/**
	 * @return the params
	 */
	public List<SymbolParameter> getParams() 
	{
		return params;
	}

	/**
	 * @param params the expressions to set
	 */
	public void setParams(List<SymbolParameter> params) 
	{
		this.params = params;
	}
	
	/**
	 * 
	 * @param e
	 */
	public void addParameter(SymbolParameter e) 
	{
		this.params.add(e);
	}
	
	/**
	 * 
	 * @return
	 */
	public int getNumParams() 
	{	
		return this.getParams().size();
	}
	
	/**
	 * 
	 * @param pos
	 * @return
	 */
	public SymbolParameter get(int pos)
	{
		return this.getParams().get(pos);
	}
	
	/**
	 * 
	 * @param parameters
	 * @return
	 */
	public SymbolParameter compareTo(List<SymbolParameter> parameters)
	{
		for(int i = 0; i < params.size(); i++)
		{
			String param = params.get(i).getType().getName();
			String esperado = parameters.get(i).getType().getName();

			if ( ! param.equals(esperado) )
			{
				return params.get(i);
			}
		}
		
		return null;
	}
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public boolean containsParameter(String name)
	{
		for (SymbolParameter symbolParameter : params) 
		{
			if ( symbolParameter.getName().equalsIgnoreCase(name) ) return true;
		}
		
		return false;
	}
}
