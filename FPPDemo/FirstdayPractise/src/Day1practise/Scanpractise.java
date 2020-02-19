package Day1practise;

import java.util.Scanner;

public class Scanpractise {

	public static void main(String[] args) {
	    Scanner z= new Scanner(System.in);
    	System.out.println("Write your first name:");
    	String f= z.nextLine();//only one
    	System.out.println("Write your last name");
    	String l= z.next();
    	System.out.println("Write your age");
    	int age= z.nextInt();
    	z.close();
    	
    }
}

