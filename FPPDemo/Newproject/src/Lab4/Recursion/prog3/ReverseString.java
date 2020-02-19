package Lab4.Recursion.prog3;

public class ReverseString {
 StringBuilder sb= new StringBuilder();
	public static void main(String[] args) {
		
		ReverseString res= new ReverseString();
		
		System.out.println(res.reverse("Hello"));
		System.out.println(res.reverseUtil("hello"));
	}
	public String reverse(String str) {
		if(str==null||(str.length())==0) 
			return str;
	
			String first=""+ str.charAt(0);
			return reverse(str.substring(1))+first ;
		}

	
	
	public String reverseUtil(String str) {
		return reverseUlitity(str,str.length()-1);
	}
	
	private String reverseUlitity(String str,int len) {
		if(len<0) {
			return sb.toString();
		}
		
		sb.append(str.charAt(len));
		return reverseUlitity(str,len-1);
	}

		
	}
