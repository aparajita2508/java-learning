package flowerSubClass;

import flowerSuperClass.Flower;

public class Rose extends Flower{
	
	public Rose()
	{
		
	}
	
	public Rose(String c,String flowerColor)
	{
		setColor(flowerColor);
		setName(flowerColor);
	}
	
	public void describeFlower()
	{
		// This is overridden method, we have changed the behavior from super class
		System.out.println("Roses are beautiful");
	}
	
	protected void method_overloading_example(String args)
	{
		// This is overloaded method, we have changed the signature, name remains same
		System.out.println("Roses are beautiful");
	}
	
	protected int method_overloading_example(int args)
	{
		// This is overloaded method, we have changed the signature, name remains same
		System.out.println("Roses are beautiful");
		return 0;
	}
	public static void main(String args[])
	{
		Rose rose_object = new Rose();
		rose_object.describeFlower();
		Rose rose_object_custom = new Rose("Chinense Rose", "White");
		rose_object_custom.describeFlower();
		
		// Example of polymorphism, explain with better example
		Flower flower_object_poly = new Flower();
		
		Flower rose_object_poly = new Rose();
		
		flower_object_poly.describeFlower();
		rose_object_poly.describeFlower();
	}
}
