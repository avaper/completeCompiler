package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class RegCampo extends NonTerminal 
{
	private String name;
	private TypeIF type;
	private int line;
	private int position;
	
	/**
	 * 
	 */
	public RegCampo() 
	{
		super();
	}

	/**
	 * @param name
	 * @param type
	 */
	public RegCampo(String name, TypeIF type, int line) 
	{
		super();
		this.name = name;
		this.type = type;
		this.setLine(line);
	}
	
	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
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
	 * @return the line
	 */
	public int getLine() 
	{
		return line;
	}

	/**
	 * @param line the line to set
	 */
	public void setLine(int line) 
	{
		this.line = line;
	}

	@Override
	public String toString() 
	{
		return "Field - [name=" + this.name + ", type=" + this.type.getName() + ", position=" + this.position + "]";	
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
