 package sami09;

public class Q13 {

	public static void main(String[] args) {
		
		
		 /* 13. Write a function that accepts a character array, a zero-based start
		 * position and a length. It should return a character array containing
		 * containing length characters starting with the start character of the input
		 * array. The function should do error checking on the start position and the
		 * length and return null if the either value is not legal. The function
		 * signature is: char[ ] f(char[ ] a, int start, int len) */
	    char[]list= { 'a','b','c','d','e'};
	    int sis=0;
	    int num=4;
		char[] result=f(list, sis, num);
		System.out.println(result);
	}// i must revise this and i am sure will gain extra knowledge
      public static char[]f(char[]a,int start,int length){
    	  if(length<0||start<0||start+length-1>=a.length) {
    		  return null;
    		  
    	  }
    	  char[]mis=new char[length];
    	  for(int i=start,j=0;j<length;i++,j++) {
    		 mis[j]=a[i];
    	  }
    	  return mis;
      }
}
