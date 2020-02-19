package lesson3Question2;
import java.text.DateFormat;
import java.time.LocalDate;

public class UtilClass {
	public static class Util { 
		public static String dateAsString(LocalDate hireDate) {  
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);   
		return f.format(hireDate);  
		}
	}
	
}
