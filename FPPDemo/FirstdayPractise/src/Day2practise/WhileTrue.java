package Day2practise;

import java.util.Scanner;

public class WhileTrue {

	public static void main(String[] args) {
		
   // while_ture_();// for what purpose I do this one;
	}
 static void while_true_() {
	  Scanner sc= new Scanner(System.in);
	  int sum=0;
	  while(true) {
	  System.out.println("Write the input The number!");
	  int input=sc.nextInt();
	  sum= sum+input;
	  if( input<=0) {
		  break;
	  }}
	 System.out.println(sum);
	 sc.close();
 }
}
