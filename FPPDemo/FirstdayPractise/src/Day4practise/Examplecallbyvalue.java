package Day4practise;

public class Examplecallbyvalue {

	public static void main(String[] args) {
		
   Employee a= new Employee("Jirom");
   Employee b= new Employee("Selam");
   System.out.println(a.getName()+":"+b.getName());
   swap(a,b);
   System.out.println(a.getName()+":"+b.getName());
  
	}
private static void swap(Employee x,Employee y) {
	Employee temp=  x;
	x= y;
	y = temp;
	
	 System.out.println(x.getName()+":" + y.getName());
}
}
