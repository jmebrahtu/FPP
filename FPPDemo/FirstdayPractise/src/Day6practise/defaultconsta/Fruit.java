package Day6practise.defaultconsta;

public class Fruit {
                                      	//String p;
	Fruit(){
		//Apple a= new Apple() ;
		System.out.println("constractor of super class");
		}

	public static void main(String[] args) {
		 new Apple();
	}
}// stack over flow exception will occur if object is subclass are create at the super class and 
	//Fruit(String p){
		//this.p= p;
	//}
	/*
	 * Fruit(){ // if we dont invoke the default constractor in the super class or
	 * //by using super if we dont call the constractor of the super then compaile
	 * error will occur.
	 * 
	 * } public Fruit(String name) {
	 * System.out.println("FRuit constarctor is invoked"); }
	 */

