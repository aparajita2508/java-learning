package encapsulation;

import java.io.IOException;

public class EncapsulationDemo {

	/*
	 * Benefits of Encapsulation: The fields of a class can be made read-only or
	 * write-only.
	 * 
	 * A class can have total control over what is stored in its fields.
	 * 
	 * The users of a class do not know how the class stores its data. A class
	 * can change the data type of a field and users of the class do not need to
	 * change any of their code.
	 */

	public static void main(String args[]) {
		EncapsulationPractice encap = new EncapsulationPractice();
		encap.setName("James");
		try {
			encap.setAge(20);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		encap.setIdNum("12343ms");

		System.out.print("Name : " + encap.getName() + " Age : "
				+ encap.getAge());

		encap.height = -10.0; // because height is not encapsulated we can set
		// invalid values too
	}
}
