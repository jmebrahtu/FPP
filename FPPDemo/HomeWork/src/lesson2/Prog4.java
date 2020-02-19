package lesson2;
import java.util.Scanner;
public class Prog4 {

	public static void main(String[] args) {
		
		
			Scanner reader = new Scanner(System.in);  
			System.out.println("Enter a String: ");
			String input = reader.next();
			
			reader.close();
			for(int i=input.length()-1;i>=0;i--) {
				System.out.print(input.charAt(i));
				
			}
		}

	

	}


