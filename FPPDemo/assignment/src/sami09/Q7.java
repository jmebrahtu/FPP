package sami09;

public class Q7 {

	public static void main(String[] args) {
		
		 /* 7. Write a function named isSorted that accepts an integer array and returns
		  1 if its elements are in ascending or descending order, otherwise it returns 0*/
		  int[]num= {1,2,5,6,7};
		 int result=isSorted(num);
		 System.out.println(result);
	}//i must revise why in example  {} the result is different. and i must revise again and again 
     public static int isSorted(int[]a) {
    	 if(a.length==0) {
    		 return 1;
    	 }
    	 int sort=0;
    	 int ascending=0;
    	 int descending=0;
    	 for(int i=0;i<a.length-1;i++) {
    		 if(a[i]<a[i+1]) {
    			 ascending++;
    		 }
    		 else if(a[i]>a[i+1]) {
    			 
    			descending++; 
    		 }
    	 }
    	 if(descending==a.length-1||ascending==a.length-1) {
    		 return 1;
    		 
    	 }
    	 return 0;
     }
}
