package Day2practise;

import java.util.Stack;

public class PalindromeStack {

	public static void main(String[] args) {
		Poli("MUM");

	}
   static void Poli(String a) {
	   Stack<Character>poli= new Stack<Character>();
	   char ch;
	   for( int i=0;i<a.length();i++) {//using for loap to pass alll the elemnt
		   ch = a.charAt(i);// recive one character
		   poli.push(ch); // fill the char in the stack using push
		   
	   }
	   for(int i=0;i<a.length();i++){
		   ch=a.charAt(i);
		   if(!poli.peek().equals(ch)) {// using peek method retrive the element and compare with ch 
			System.out.println("It is not palidrome");
			break;
		   }
		   poli.pop();
		   System.out.println("It is palidrome");
		   break;
	   }
	   
   }
}
