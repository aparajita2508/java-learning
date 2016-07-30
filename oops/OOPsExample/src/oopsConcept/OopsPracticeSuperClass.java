package oopsConcept;

public class OopsPracticeSuperClass {
	
	String instance_name = "Super Instance"; // this is called instance variable, this is declared inside class
	// but outside a method
	
	static String static_name = "Super Static"; // this is called static variable, this is declared inside class
	// but outside a method with the keyword static
	
	void demo_function()
	{
		String local_name = "Super Local"; // This is a local variable, this is declared inside a block
	}
	
	OopsPracticeSuperClass()
	{
		// This is a constructor, this doesn't have a return type and name is same as class
	}

}
