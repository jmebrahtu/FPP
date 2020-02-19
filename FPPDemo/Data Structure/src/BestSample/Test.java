package BestSample;

public class Test {
	
 public static void  tryOutExceptions()throws Exception{
	 try {
		 throw new Exception("Exception inside try catch block");
	 }
	 catch( Exception x) {
		 System.out.println("Exception in side catch block");
	 }
	 finally {
	 System.out.println("In finally block");
 }
	 System.out.println("the message method");
}
  public static void main (String[]args) {
	  try {
		  tryOutExceptions();
	  }
	  catch(Exception x) {
		  System.out.println(x.getMessage());
	  }
  }
}
