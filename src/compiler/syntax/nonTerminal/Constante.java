package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for constants
 */
public class Constante extends NonTerminal 
{
	private TypeIF type;
	private String value;
	
	/**
	 * 
	 */
	public Constante() 
	{
		super();
	}

	/**
	 * @param type
	 * @param value
	 */
	public Constante(TypeIF type, String value) 
	{
		super();
		this.type = type;
		this.value = value;
	}
	
	/**
	 * 
	 * @param c
	 */
	public Constante(Constante c) 
	{
		super();
		this.type = c.type;
		this.value = c.value;
	}

	/**
	 * @return the type
	 */
	public TypeIF getType() 
	{
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(TypeIF type) 
	{
		this.type = type;
	}

	/**
	 * @return the value
	 */
	public String getValue() 
	{
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) 
	{
		this.value = value;
	}
}
