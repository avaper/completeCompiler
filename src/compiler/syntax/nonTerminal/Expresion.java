package compiler.syntax.nonTerminal;

import compiler.semantic.type.TypeFunction;
import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Expresion extends NonTerminal 
{
	private TypeIF type;

	/**
	 * 
	 */
	public Expresion() 
	{
		super();
	}

	/**
	 * @param type
	 */
	public Expresion(TypeIF type) 
	{
		super();
		
		if (type instanceof TypeFunction)
		{
			this.type = ((TypeFunction) type).getReturnType();			
		}
		else 
		{
			this.type = type;			
		}
	}
	
	
	public Expresion(Expresion e) 
	{
		super();
		this.type = e.getType();
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
}
