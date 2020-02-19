package prob5;

public class TestComputer {
	
		public static void main(String[] args) {
			Computer c1 = new Computer("toshiba","i5",4,25);
			Computer c2 = new Computer("toshiba","i5",4,25);
			Computer c3 = new Computer("Dell","i8",6,30);
			Computer c4 = c3;
			System.out.println("The equality of : "+ c1.toString() + " & \n" + c2.toString()+ " is "+ c1.equals(c2));
			System.out.println();
			// Printing hash values
			System.out.println("Hash values: ");
			System.out.println("c1 hashCode" + c1.hashCode());
			System.out.println("c2 hashCode" +c2.hashCode());
			
			System.out.println("============================");
			System.out.println();
			
			System.out.println("The equality of : "+ c3.toString() + " &\n" + c2.toString()+ " is "+ c3.equals(c2));
			
			// Printing hash values
			System.out.println();
			System.out.println("Hash values: ");
			System.out.println("c2 hashCode" +c2.hashCode());
			System.out.println("c3 hashCode" +c3.hashCode());
		}

		
	}



