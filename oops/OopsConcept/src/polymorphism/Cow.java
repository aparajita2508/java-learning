package polymorphism;

public class Cow extends Animal implements Vegetarian {
	
	public void eat()
	{
		System.out.println("Cow eat grass");
	}
	
	public void color()
	{
		System.out.println("Cow is white");		
	}
}
