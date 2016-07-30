package polymorphism;

public class Deer extends Animal implements Vegetarian{
	
	public void eat()
	{
		System.out.println("Deer eat grass");
	}
	
	public void color()
	{
		System.out.println("Deer is yellow");		
	}

}
