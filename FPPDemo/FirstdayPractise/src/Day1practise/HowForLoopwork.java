package Day1practise;

public class HowForLoopwork {

	//what are the numbers out put for this questions  I need explanation for this one
	public static void main(String[] args) {
		//output o= new output();
 //o.go();
	}
   void go() {
	   int y= 7;
	   for(int i=1;i<8;i++) {
		   y++;
		   if(i>4) {
			   System.out.println(++y+"");
		   }
		   if(y>14) {
			   System.out.println("i="+i);
			   break;
		   }
	   }
   }
}
