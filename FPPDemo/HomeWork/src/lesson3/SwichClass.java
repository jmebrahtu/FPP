package lesson3;

	import java.util.Scanner;

	final class SwitchClass {
		static boolean a = true;

		public static void choices() {
			String YN = null;
			while (a) {
				System.out.println("Enter \"C\" for Circle");
				System.out.println("Enter \"R\" for Rectangle");
				System.out.println("Enter \"T\" for Triangle");
				System.out.println();
				// reading from console
				Scanner ch = new Scanner(System.in);
				String choice = ch.next();

				switch (choice) {
				case "t":
				case "T":
					ImmutableMainClass.triangle();
					break;
				case "c":
				case "C":
					ImmutableMainClass.circle();
					break;

				case "r":
				case "R":
					ImmutableMainClass.rectangle();
					break;

				default:
					System.out.println(" Enter letters from the list of choices provided only, please!!!");
				}
				System.out.println("Do you want to continue :y/n");
				// providing the list of choices again
				Scanner YesNo = new Scanner(System.in);
				YN = YesNo.next();
				if (YN.equalsIgnoreCase("n"))
					a = false;
				else if (!(YN.equalsIgnoreCase("y"))) {
					System.out.println(" Follow the instructions please:");
					System.out.println("Enter either \"y\" or \"n\" based on your choice");
					a = false;
				}

			}
		}
	}




