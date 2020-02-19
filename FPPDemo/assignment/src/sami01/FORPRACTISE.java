package sami01;

public class FORPRACTISE {

	public static void main(String[] args){
	
		
		
			
	   }
	public static boolean isSmallFactor(int a,int b) {
		
		for(int i=1;i<a;i++) {
			if(b%i==0) {
				if(i<a&&b/i<a) {
					return true;
					
				}
				
			}
		}
		return false;	
		}
    }
