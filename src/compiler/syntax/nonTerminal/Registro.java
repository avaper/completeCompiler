package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class Registro extends NonTerminal 
{
	private List<RegCampo> fields;
	private int line;

	/**
	 * 
	 */
	public Registro() 
	{
		super();
		this.fields = new ArrayList<RegCampo>();
	}
	
	/**
	 * @param fields
	 */
	public Registro(Registro r) 
	{
		this();
		this.fields= r.getFields();
		this.line = r.getLine();
	}

	public Registro(RegCampo field) 
	{
		this();
		this.fields.add(0, field);
		this.line = field.getLine();
	}
	
	/**
	 * @return the fields
	 */
	public List<RegCampo> getFields() 
	{
		return fields;
	}

	/**
	 * @param fields the fields to set
	 */
	public void setFields(List<RegCampo> fields) 
	{
		this.fields = fields;
	}
	
	/**
	 * 
	 * @param pos
	 * @return
	 */
	public RegCampo getField(int pos) 
	{
		return this.fields.get(pos);
	}
	
	/**
	 * 
	 * @param field
	 */
	public void addField(RegCampo field) 
	{		
		this.fields.add(0, field);
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
	 * 
	 * @param field
	 * @return
	 */
	public boolean containsField(String field) 
	{
		for (RegCampo regCampo : fields) 
		{
			if (regCampo.getName().equalsIgnoreCase(field))
			{
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 
	 * @return
	 */
	public void setPositions()
	{
		int size = 0;
		
		for (RegCampo regCampo : fields) 
		{
			regCampo.setPosition(size);
			size++;
		}
	}
}
