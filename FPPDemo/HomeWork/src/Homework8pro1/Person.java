package Homework8pro1;

public class Person {

	public static void main(String[] args) {
	}
		private String lastName; 
		private String firstName;  
		private int age;  

public Person(String last, String first, int a) { // constructor 
	lastName = last; 
   firstName = first;  
       age = a; 
       } 
 public String getLast() // get last name 
 {   return lastName; 
 
 }  
	@Override  public String toString() {
		return
"Person [lastName=" + lastName + "\n FirstName=" + firstName + "\nAge=" + age + "]";
	
	}
	
}
