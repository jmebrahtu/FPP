package lesson3question3;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("Mera","Mera", 4000,2017,5,8);
		Account checking = new Account(employee,
                                               AccountType.CHECKING,
					  500);
		Account savings = new Account(employee,
				   AccountType.SAVINGS,
				   500);
		Account retirement = new Account(employee,
				   AccountType.RETIREMENT,
				   500);
		System.out.println(checking);
		System.out.println(savings);
		System.out.println(retirement);
	}
}
