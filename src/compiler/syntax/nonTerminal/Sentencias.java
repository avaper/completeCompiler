package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Sentencias extends NonTerminal 
{
	private List<Sent> sentencias;
	private boolean returnContained = false;
	private boolean balanced = true;
	private ScopeIF scope;

	/**
	 * 
	 */
	public Sentencias() 
	{
		super();
		this.setSentencias(new ArrayList<Sent>());
	}
	
	/**
	 * @return the sentencias
	 */
	public List<Sent> getSentencias() 
	{
		return sentencias;
	}
	
	/**
	 * @param sentencias the sentencias to set
	 */
	public void setSentencias(List<Sent> sentencias) 
	{
		this.sentencias = sentencias;
	}

	/**
	 * @return the returnContained
	 */
	public boolean isReturnContained() 
	{
		return returnContained;
	}

	/**
	 * @param returnContained the returnContained to set
	 */
	public void setReturnContained(boolean returnContained) 
	{
		this.returnContained = returnContained;
	}

	/**
	 * 
	 * @return
	 */
	public TypeIF getReturnType()
	{
		TypeIF type = null;
		
		for (Sent sent : sentencias) 
		{
			if ( sent.getReturnType() != null ) type = sent.getReturnType();
		}
		
		return type;
	}
	
	/**
	 * 
	 * @param sent
	 */
	public void addSentence(Sent sent)
	{
		this.sentencias.add(0, sent);
		
		if ( sent.getReturnType() != null ) 
		{			
			if ( ! sent.isBalanced() && ! this.isReturnContained() ) this.setBalanced(false);					
			
			this.setReturnContained(true);
		}
	}

	/**
	 * @return the balanced
	 */
	public boolean isBalanced() 
	{
		return balanced;
	}

	/**
	 * @param balanced the balanced to set
	 */
	public void setBalanced(boolean balanced) 
	{
		this.balanced = balanced;
	}

	/**
	 * @return the scope
	 */
	public ScopeIF getScope() {
		return scope;
	}

	/**
	 * @param scope the scope to set
	 */
	public void setScope(ScopeIF scope) {
		this.scope = scope;
	}
}
