package encapsulation;

import java.io.IOException;

/*Encapsulation is one of the four fundamental OOP concepts. 
The other three are inheritance, polymorphism, and abstraction.*/

/*Encapsulation in Java is a mechanism of wrapping the data (variables) 
and code acting on the data (methods) together as as single unit. 
In encapsulation the variables of a class will be hidden from other classes, 
and can be accessed only through the methods of their current class, 
therefore it is also known as data hiding.*/

public class EncapsulationPractice {

/*	To achieve encapsulation in Java

	1) Declare the variables of a class as private.

	2) Provide public setter and getter methods to modify and view the variables values.*/
	   private String name;
	   private String idNum;
	   private int age;
	   public double height;

	   public int getAge(){
	      return age;
	   }

	   public String getName(){
	      return name;
	   }

	   public String getIdNum(){
	      return idNum;
	   }

	   public void setAge( int newAge) throws IOException{
		   if(age > 0)
		   {
			   age = newAge;
		   }
		   else {
			   throw new IOException("Invalid age, should be a positive integer");
		   }
		   //because of encapsulation, we can validate data input
	   }

	   public void setName(String newName){
	      name = newName;
	   }

	   public void setIdNum( String newId){
	      idNum = newId;
	   }
	   
/*	   The public setXXX() and getXXX() methods are the access points of the instance variables
	   of the EncapsulationPractice class. Normally, these methods are referred as getters and setters. 
	   Therefore any class that wants to access the variables should access them through 
	   these getters and setters.*/
}
