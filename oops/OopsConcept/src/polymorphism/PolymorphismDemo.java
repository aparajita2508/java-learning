package polymorphism;

import java.util.Scanner;

public class PolymorphismDemo {

	public static void main(String args[]) {
		Scanner one = new Scanner(System.in);
		System.out.println("Enter the value of Reference: [Veg/Animal]");
		String refName = one.next();
		System.out.println("Enter the value of Animal: [Cow/Deer]");
		String animalName = one.next();
		one.close();
		System.out.println(refName);
		if (refName.equals("Veg")) {
			Vegetarian v;
			if (animalName.equals("Deer")) {
				v = new Deer();
				v.eat();
			} else if (animalName.equals("Cow")) {
				v = new Cow();
				v.eat();
			} else {
				System.out.println("Wrong Animal");
			}

		} else if (refName.equals("Animal")) {

			Animal a;
			if (animalName.equals("Deer")) {
				a = new Deer();
				a.color();
			} else if (animalName.equals("Cow")) {
				a = new Cow();
				a.color();
			} else {
				System.out.println("Wrong Animal");
			}
		} else {
			System.out.println("Wrong reference given");
		}
	}

}
