package prob6;

public class MainTestingPersonCloning {
	
	
		public static void main(String[] args) throws CloneNotSupportedException {
			Computer c = new Computer("toshiba", "i5", 4, 25);
			Person originalPerson = new Person("jirom", c);
			
			// shallow copying by cloning
			Person clonedPerson = (Person)originalPerson.clone();
			
			// Printing after shallow copying
			System.out.println("Object before cloning is :" + originalPerson.toString());
			System.out.println("Object after cloning is :" + clonedPerson.toString());
			
			
			// check if changes made in either of the objects affects the other object 
			// to prove this is shallow copying
			
			clonedPerson.computer.setManufacturer("Apple");
			
			System.out.println();
			System.out.println("----Shallow Copying---");
			System.out.println("Changes made on either one afect both original and cloned objects");
			System.out.println("===============================================================");
			System.out.println("Original object changed to :" + originalPerson.toString());
			System.out.println("Cloned object changed to  :" + clonedPerson.toString());
		}

	}



