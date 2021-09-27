
package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class Subrutina extends NonTerminal
{
	private List<VarSeqDeIds> paramSeq;

	/**
	 * 
	 */
	public Subrutina() 
	{
		super();
		this.setParamSeq(new ArrayList<VarSeqDeIds>());
	}

	/**
	 * 
	 * @param paramSeq
	 */
	public Subrutina(VarSeqDeIds paramSeq) 
	{
		this();
		this.paramSeq.add(paramSeq);
	}
	
	/**
	 * @param paramSeq
	 */
	public Subrutina(List<VarSeqDeIds> paramSeq) 
	{
		this();
		this.paramSeq = paramSeq;
	}

	/**
	 * 
	 * @param s
	 */
	public Subrutina(Subrutina s) 
	{
		this();
		this.paramSeq = s.paramSeq;
	}

	/**
	 * @return the paramSeq
	 */
	public List<VarSeqDeIds> getParamSeq() 
	{
		return paramSeq;
	}

	/**
	 * @param paramSeq the paramSeq to set
	 */
	public void setParamSeq(List<VarSeqDeIds> paramSeq) 
	{
		this.paramSeq = paramSeq;
	}
	
	/**
	 * 
	 * @param p
	 */
	public void addParameter(VarSeqDeIds p) 
	{
		this.paramSeq.add(p);
	}
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public String containsParam (VarSeqDeIds params)
	{
		for (VarSeqDeIds varSeqDeIds : paramSeq) 
		{
			for (String id : params.getIDs()) 
			{
				if ( varSeqDeIds.getIDs().contains(id) )
				{
					return id;
				}
			}
		}
		
		return null;
	}
}
