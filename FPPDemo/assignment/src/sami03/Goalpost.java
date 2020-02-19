package sami03;

public class Goalpost {

	public static void main(String[] args) {
		
		 /* 1.A goalpost number is defined as follows • it is greater than 0 • it has
		 * five digits • the first and last digits are the same So 11111 and 93229 are
		 * goal post numbers but 15432, 121, 132323231 and -23452 are not. Write a
		 * function named isGoalPost that returns 1 if its argument is a goal post
		 * number. Otherwise it returns 0. The function signature is intisGoalPost (int*/
		 
		int list=(12341);
		int result=isGoalPost(list);
		System.out.println(result);
	}

	public static int isGoalPost(int n) {
		
		// check if the number is five digits and positive
				// the minimum is 10001 and maximum is 99999
				if (n < 10001 || n >= 100000) {
					return 0;
				}

				
				
				// check the first and last digits
				int first = n / 10000;
				int last = n % 10;

				if (first == last) {
					return 1;
					
				}

				return 0;
			}

		}

