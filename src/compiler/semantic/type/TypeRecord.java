package compiler.semantic.type;

import java.util.ArrayList;
import java.util.List;
import compiler.syntax.nonTerminal.RegCampo;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

/**
 * Class for TypeRecord.
 */

// TODO: Student work
//       Include properties to characterize records

public class TypeRecord
    extends TypeBase
{   
	
	private List<RegCampo> fields;
	
    /**
     * Constructor for TypeRecord.
     * @param scope The declaration scope.
     */
    public TypeRecord (ScopeIF scope)
    {
        super (scope);
        this.fields = new ArrayList<RegCampo>();
    }

    public TypeRecord (ScopeIF scope, String name, List<RegCampo> fields)
    {
        this(scope);
        this.setName(name);
        this.fields = fields;
    }
    
    /**
     * Returns the size of the type.
     * @return the size of the type.
     */
    @Override
    public int getSize ()
    {
        return this.fields.size();
    }

	/**
	 * @return the fields
	 */
	public List<RegCampo> getFields() {
		return fields;
	}

	/**
	 * @param fields the fields to set
	 */
	public void setFields(List<RegCampo> fields) {
		this.fields = fields;
	}
	
	/**
	 * 
	 * @param field
	 * @return
	 */
	public RegCampo getField(String field)
	{
		for (RegCampo regCampo : fields) {
			if (regCampo.getName().equalsIgnoreCase(field))
			{
				return regCampo;
			}
		}
		
		return null;
	}
	
	/**
	 * 
	 * @param name
	 * @param type
	 */
	public void addField(RegCampo field) 
	{
		//this.fields.add(this.fields.size(), field);
		this.fields.add(0, field);
	}
	
	/**
	 * 
	 * @param fields
	 */
	public void addAllFields(List<RegCampo> fields) 
	{
		//this.fields.addAll(this.fields.size(), fields);
		this.fields.addAll(0, fields);
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
	 * @param field
	 * @return
	 */
	public int getFieldPosition(String field)
	{
		return this.getField(field).getPosition();
	}
}
