package Excerise1;

public class MyClass {

			public static void main(String[] args) {
				int[] arr= {2, 5, -3, 11, 1};
			int result=	product(arr);
			System.out.println(result);
			String res= "";
		//	System.out.println( concatenate(''));
			  
			}
			
			static int product(int[] arr) {
		         int pro=1;
		    for(int i=0;i<arr.length;i++){
		        pro= pro*arr[i];

			}	
				return pro;
			}
			


            
			static String concatenate(String[] r) {
				String k="";
				 for(int i=0;i<r.length;i++){
				        k= k+r[i];

					}	
					
				return k;
			}

	}


