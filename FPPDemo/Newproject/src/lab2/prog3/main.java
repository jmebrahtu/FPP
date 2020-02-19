package lab2.prog3;

public class main {
	
public static void main(String[]a) {
		
		
	
		double sum=0.0;
		DeptEmployee bob= new  Proffesor("bob",500,1999,8,3,2);
		DeptEmployee tom= new  Proffesor("tom",400,2000,12,4,1);
		DeptEmployee rob= new  Proffesor("rob",600,1993,6,5,0);
		DeptEmployee jirom= new  Secratery("jim",300,2017,5,8,4.98);
		DeptEmployee mike= new  Secratery("mike",7000,2000,2,8,5.87);
	
		
		DeptEmployee[] emp= {bob,tom,rob,jirom,mike};
		for (DeptEmployee deptEmployee : emp) {
			
		sum+=deptEmployee.computeSalary();
		
		}
		System.out.println(sum);
		}
		
	}


