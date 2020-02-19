package lesson2;

public class Prog5 {

	public static void main(String[] args) {
		
			int x = RandomNumbers.getRandomInt(1, 99);
			int[][] arr = new int[4][4];

			// Populating array with numbers
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = x;
					x = RandomNumbers.getRandomInt(1, 99);
				}
			}

			// Printing numbers from array
			for (int i = 0; i < arr.length; i++) {
				// Printing first lines
				if (i == 2) {
					for (int j = 0; j < arr[i].length; j++)
						System.out.print("____" + "\t ");
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
				}

				for (int j = 0; j < arr[i].length; j++) {
					if (i % 2 != 0)// Print Addition operator(+) in the second line of every computation
						System.out.print("+" + arr[i][j] + "\t ");
					else
						System.out.print(" " + arr[i][j] + "\t ");
				}
				System.out.println();
			}
			// Printing last lines
			for (int j = 0; j < 4; j++) {
				System.out.print("____" + "\t ");

			}
		}

	


	}


