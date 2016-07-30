package flowerSuperClass;

public class Flower {
	private String name;
	private String color;
	private int instance_number;
	private static String class_variable;
	private static int class_number;
	private String example_variable;
	// for encapsulation all variables should be made private and getter and setter methods should be defined
	public String getName()
	{
		return name;
	}
	
	public void setName(String flowerName)
	{
		// setter
		name = flowerName;	
	}
	
	public String getColor()
	{
		// getter
		return color;
	}
	
	public void setColor(String colorName)
	{
		color = colorName;	
	}
	
	
	public Flower()
	{
		// This is a default constructor, This is called when class is instantiated
		// This is present by default if no other constructors are defined
		color = "default color";
		name = "default name";		
	}
	
	public Flower(String flowerName, String flowerColor)
	{
		// This is a constructor defined by user
		name = flowerName;
		color = flowerColor;
	}
	
	public void describeFlower()
	{
		System.out.println("Flowers are beautiful");
		System.out.println("Name of this flower is "+name);
		System.out.println("Color of this flower is "+color);
	}
	
	static void class_method_example()
	{
		System.out.println("This is a static method");
	}
	public static void main(String args[])
	{
		Flower flowerObject = new Flower(); // instantiation of an object of a class
		flowerObject.describeFlower();
		Flower flowerObject_custom = new Flower("Super Class Flower","No Color"); // instantiation of an object of a class
		flowerObject_custom.describeFlower();
		Flower flowerObject_rose = new Flower("Rose","Red"); // instantiation of an object of a class
		flowerObject_rose.describeFlower();
		//Flower.class_method_example();
		//System.out.println(Flower.class_number);
		//System.out.println(Flower.class_variable);
	}

}
