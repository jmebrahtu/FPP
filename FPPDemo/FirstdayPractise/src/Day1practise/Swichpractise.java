
package Day1practise;



public class Swichpractise {

	public static void main(String[] args) {
		
         //int y= 10;
        
         //System.out.println(switch_(y));

	}

	public static  void switch_(int a) {
		int x=0;
	
	     switch (a){
			case 1:
			x+=5;
			break;
			case 2:
				x+=10;
				break;
			case 3:
			x+=16;
			break;
			case 4:
				x+=34;
				break;
	     }
	     System.out.println("The value x:"+x);
	}
}
