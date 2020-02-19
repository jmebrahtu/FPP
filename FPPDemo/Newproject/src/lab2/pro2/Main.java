package lab2.pro2;

public class Main {

	public static void main(String[] args) {
		Circle a1= new Circle(3);
		// this %.2f means the num goes two number after decimal and
		//when we do |n it does not print out as concatenate for the next result with the first result
		System.out.printf("Area of Circle is: %.2f\n", a1.getArea());
		Cylinder b1= new Cylinder(4,6);
		System.out.printf("Volume of the Cylinder is :%.1f\n",b1.getVolume());
				
	 
	}
   }