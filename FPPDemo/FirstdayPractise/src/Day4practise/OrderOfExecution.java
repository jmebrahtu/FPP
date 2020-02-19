package Day4practise;

public class OrderOfExecution {

	
		private static int superInt=superIntMethod();
		private int number =0;
		
		public static int superIntMethod() {
			System.out.println("3 initialization static super int");
			return 1;
		}
		OrderOfExecution(int number){
			this();
			this.number= number;
		System.out.println("4-running OrderOfExecution constractor");
		}
		OrderOfExecution(){
			System.out.println("5- running OrderOfExecution constractor");
			
		}
		{
			
		System.out.println("6-Number="+number);
		System.out.println("2-Running super object initialization block");
	}
   static {
	   System.out.println("1-Execution super static block");
   }
   public static void main(String[] args) {
	   new OrderOfExecution(3);
   }
}
