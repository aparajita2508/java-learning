package oopsConcept;

class Student10{  
    int id;  
    String name;  
      
    Student10(int id,String name){  
    this.id = id;
    id = id;
    this.name = name;  
    }
    
    Student10(int id1,String name1, String placeHolder){  
    id = id1;  
    this.name = name1;  
    } 
    
    void display(){
    	System.out.println(id+" "+name);
    	}  
  
    public static void main(String args[]){  
    	Student10 s1 = new Student10(111,"Karan");  
	    Student10 s2 = new Student10(321,"Aryan","uit");  
	    s1.display();  
	    s2.display();  
    }  
} 
