package practise0304080910;
 import java.util.ArrayList;
public class As {

	public static void main(String[] args) {
		int sis=6936;
		int[] result=isAs(sis);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		

	}
 public static int[]  isAs(int a) {
	 ArrayList<Integer>mylist=new ArrayList<Integer>();
 
	 int i=2;
	 
	 while(a>1) {
		 if(a%i==0) {
			 mylist.add(i);
			 a=a/i;
		 }
	 i++;
     }
	 int[]num= new int[mylist.size()];
	 for(int j=0;j<mylist.size();j++) {
		 num[j]=mylist.get(j);
		 
	 }
    
 return num;
   }
  }
   