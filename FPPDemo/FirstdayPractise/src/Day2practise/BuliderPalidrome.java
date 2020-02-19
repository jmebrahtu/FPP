package Day2practise;

public class BuliderPalidrome {

	public static void main(String[] args) {
		
		String d= "POP";
		StringBuilder s= new StringBuilder();
		s.append(d);
       String reverse= s.reverse().toString();
		if(d.equals(reverse)) {
       //if (d.equals(s.reverse().toString())) {
    	   System.out.println("This is palidrome");
    	   
       }else
    	System.out.println("This is not a palidrome");   
       }
       
	}


