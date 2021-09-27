package compiler.semantic.type;

import es.uned.lsi.compiler.semantic.ScopeIF;

/**
 * Class for TypeSimple.
 */

// TODO: Student work
//       Include properties to characterize simple types

public class TypeBoolean
    extends TypeSimple
{
	
	public TypeBoolean(ScopeIF scope) {
		super(scope);
		this.setName("BOOLEAN");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return super.getSize();
	}
	
}
