package lesson2;

public class Prog7 {

	public static void main(String[] args) {
		
			int len = args.length;
			for (int i = 0; i < len; i++) {
				String temp = args[i].toString();
				System.out.println("length of" + " \"" + args[i] + "\" " + "is " + temp.length());

			}
			System.out.println("String inputs which starts with letter \"A\" are:");
			for (int i = 0; i < len; i++) {
				String temp = args[i].toString();
				if (temp.startsWith("A"))
					System.out.println(temp);

			}

		}

	

	}


