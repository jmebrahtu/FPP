package prob2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		DeptEmployee[] ob= new DeptEmployee[5];
		ob[0]= new Professor("jirom",500,2019,8,3,5);
		ob[1]= new Professor("Selam",300,2016,8,5,2);
		ob[2]= new Professor("Kiros",300,2017,4,2,3);
		ob[3]= new Secretary("Jonni",800,2012,7,6,12);
		ob[4]= new  Secretary("haylab",1000,2015,8,6,8);
		
	
  

		boolean choice = true;
		while (choice) {

			System.out.println("Do you want to see salaries of professors and secretaries along with their total :");
			Scanner s = new Scanner(System.in);
			String input = s.next();
			if (input.equalsIgnoreCase("y"))
				calculateTotal(ob);
			choice = false;
			s.close();
		}

	}

	public static void calculateTotal(DeptEmployee[] department) {
		double SumProfessors = 0.0;
		double SumSecretary = 0.0;
		double total =0.0;
		for (DeptEmployee d : department) {
			
			SumProfessors+=d.computeSalary();
			
			if (d instanceof Professor)
				SumProfessors += d.computeSalary();
			else if (d instanceof Secretary)
				SumSecretary += d.computeSalary();
		}
		total = SumProfessors + SumSecretary;
		System.out.println("Total salary for the Professors are :" + SumProfessors);
		System.out.println("Total salary for the secretaries are :" + SumSecretary);
		System.out.println("Total sum of salary for Professors & secretaries is :" + total);
		

	}



	  
	   
   }

