package lecture4;

public class MergedSortedString {

	public static void main(String[] args) {

		String x= "ace" ;
		String y="bdf";	
	 System.out.println(mSS(x, y));
	}

	public static String mSS(String z, String s) {
		if (z.length() == 0 && s.length() == 1) {
			return s;
		} else if (z.length() == 1 && s.length() == 0) {
			return z;
		} else {
			if (z.charAt(0) < s.charAt(0)) {
				return z.charAt(0) + mSS(z.substring(1), s);
			} else {
				return s.charAt(0) + mSS(s.substring(1),z);
			}
		}
	}

	

	
}


