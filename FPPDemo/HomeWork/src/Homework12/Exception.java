package Homework12;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try
//		{
//			  String str=null;
//		      System.out.println(str.length());
//		      
//		      
//		}catch (NullPointerException e) {
//			// TODO: handle exception
//			System.err.println(e);
//		}
		try {
			Scanner a=new Scanner(System.in);
			Integer x=Integer.parseInt(a.nextLine());
		}catch (NumberFormatException e) {
			System.err.println(e);
		}
		
      //print("1");  
	}

	private static void print(String sortby) {
		if (   ! sortby.equals("ByName") )
			throw new IllegalArgumentException("Invalid arguments");
		else if(! sortby.equals("BySalary") )
			throw new IllegalArgumentException("Invalid arguments");
		else
			System.out.println("Valid arguments");
		// TODO Auto-generated method stub
		
	}

}
