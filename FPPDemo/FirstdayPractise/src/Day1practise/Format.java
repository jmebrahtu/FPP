package Day1practise;

import java.util.Arrays;
import java.util.Date;

public class Format {

	public static void main(String[] args) {
		System.out.format("%-5.1f\n", 12345.78654);// this %,5.1f means print only 1 number after decimal.
		// this 5.2fmeans print 2 number after decimal and \n means make space for the next one 
		System.out.format("You owe $%,5.2f\n", 10095.500000);
		
    String date=String.format("Todays date: %td", new Date());
    System.out.println(date);
    String t= "Hello,strings can be fun.They have many uses.";
    String[] result= t.split(",| |\\.|\\.");
    System.out.println(Arrays.deepToString(result));
	
	}
}
