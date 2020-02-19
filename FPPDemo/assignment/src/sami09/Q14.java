package sami09;

public class Q14 {

	public static void main(String[] args) {
		
		 /* 16. A palindrome is a word or phase that reads the same backwards or
		 * forwards. Write a function named isPalindrome that returns true or false if
		 * the input array is a palindrome. If you are programming in Java or C#, the
		 * function signature is boolean isPalindrome(char [] arr) */
    char[] list={'t', 'o', 'p', 's', 'p', 'o', 't'};
       
        System.out.println(Palindrome(list));
		
	}// i must understand and revise again alone
public static boolean Palindrome(char[]a) {
	if(a.length==0) {
		return false;
	}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=a[(a.length-1)-i])//little bit explanation required.
				return false;
		}
		return true;
		}
	}
	


