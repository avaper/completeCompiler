package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class VarSeqDeIds extends NonTerminal 
{
	private List<String> ids;
	private TypeIF type;
	private int line;

	/**
	 * 
	 */
	public VarSeqDeIds() 
	{
		super();
		this.type = null;
		this.ids = new ArrayList<String>();
	}
	
	/**
	 * 
	 * @param type
	 * @param IDs
	 * @param line
	 */
	public VarSeqDeIds(TypeIF type, List<String> IDs, int line) 
	{
		this();
		this.type = type;
		this.ids = IDs;
		this.line = line;
	}
	
	/**
	 * @param type
	 * @param ids
	 */
	public VarSeqDeIds(String id, int line) 
	{
		this();
		this.ids.add(id);
		this.line = line;
	}

	/**
	 * 
	 * @param v
	 */
	public VarSeqDeIds(VarSeqDeIds v) 
	{
		this();
		this.type = v.type;
		this.ids = v.ids;
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
	
	/**
	 * @return the ids
	 */
	public List<String> getIDs() 
	{
		return ids;
	}
	
	/**
	 * @param ids the ids to set
	 */
	public void setIDs(List<String> ids) 
	{
		this.ids = ids;
	}

	/**
	 * 
	 * @param id
	 */
	public void addID(String id) 
	{
		this.ids.add(id);
	}
	
	/**
	 * 
	 * @param ids
	 */
	public void addAllIDs(List<String> ids) 
	{
		this.ids.addAll(ids);
	}
}
