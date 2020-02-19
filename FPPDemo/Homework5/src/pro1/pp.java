
 package pro1;
  
 
  public class pp {
 

  public static void main(String[] args) {
	  Shape[] sp = new Shape[5]; 
	  sp[0] =new Rectangle("blue", 4, 4); 
	  sp[1] = new Rectangle("green", 10, 10);
	  sp[2] = new Square("red",5);
	  sp[3] = new Square("orange",6);
 
  printTotal(sp); }
 
 public static void printTotal(Shape[] shapes) {
	   double totalPerimeter = 0.0;
	  
	  double totalArea = 0.0; 
  
 for (Shape p : shapes)
 
  {
 
 totalArea += p.calculateArea(); 
 totalPerimeter += p.calculatePerimeter();

 }
  
  System.out.println("Total area of the shapes in the array is : " +
  totalArea); System.out.println();
 System.out.println("Total perimeter of the shapes in array is : " +
  totalPerimeter);
  
 } }
 