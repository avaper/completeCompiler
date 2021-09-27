package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Sent extends NonTerminal 
{
	private TypeIF returnType = null;
	private boolean balanced = true;
	
	/**
	 * 
	 */
	public Sent() 
	{
		super();
	}
	
	public Sent(Sent s) 
	{
		this();
		this.setReturnType(s.getReturnType());
	}
	
	public Sent(TypeIF returnType) 
	{
		this();
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
	 * @return the unbalanced
	 */
	public boolean isBalanced() 
	{
		return balanced;
	}

	/**
	 * @param unbalanced the unbalanced to set
	 */
	public void setBalanced(boolean unbalanced) 
	{
		this.balanced = unbalanced;
	}
}
