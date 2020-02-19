package prob4;

public class Driver {
	
	public static void main(String[] args) {
		

		Employee[] ob = new Employee[5];
		 ob[0] = new CommisionEmployee("Jirom", "Hiyabu", "123", 40000, 10);
		 ob[1] = new HourlyEmployee("Yohana", "Goitom", "456", 50000, 50);
		 ob[2] = new SalarizedEmployee("Selam", "Essiet", "789", 9000);
		 ob[3] = new BasePlusCommissionEmployee("Mera", "Jonni", "112", 40000, 15, 4000);
		 ob[4] = new SalarizedEmployee("Hiyalab", "Mekeseb", "789", 1000);
		double sum = 0.0;
		for (Employee x : ob) {
			sum += x.getPayment();
			
		}
		
		System.out.println("Total Salary : " + sum);
	}


	}
		



