package oopsConcept;

public class OopsPracticeChildClass extends OopsPracticeSuperClass {
	
	void demo_method_child()
	{
		System.out.println(this.instance_name);
		//System.out.println(super.instance_name);
		instance_name = "Child Instance";
		System.out.println(this.instance_name);
		//super.instance_name = "vhjvhvh";
		//System.out.println(super.instance_name);
	}
	
	public static void main(String args[])
	{
		OopsPracticeChildClass childObject = new OopsPracticeChildClass();
		childObject.demo_method_child();
		OopsPracticeSuperClass superObject = new OopsPracticeSuperClass();
		System.out.println(superObject.instance_name);
		
	}

}
