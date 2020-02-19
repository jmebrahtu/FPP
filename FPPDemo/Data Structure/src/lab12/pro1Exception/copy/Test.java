package lab12.pro1Exception.copy;

public class Test {
	
	public static void main(String[] args) {
		
		String s="jirom";
		System.out.println(s);
	ClosedCurve[] objects=null  ;
		try{
			 objects = new ClosedCurve[] {new Triangle(4,5,6),
					 new Square(3),
					 new Rectangle(3,7),
					 new Circle(3)};
		
		}
		catch(IllegalTriangleException e) {// always in the catch block the subclass exception is come first
			System.err.println("An IllegalTriangleException was thrown in tranigle instance");
			System.exit(1);
		}
		catch(IllegalClosedCurveException e) {
			String classname=e.getLocalizedMessage();
			System.err.println("An IllegalClosedCurveException was thrown in a"+ e.getLocalizedMessage());
			System.exit(1);
		}
		//compute areas
		for(ClosedCurve cc : objects) {
			String nameOfCurve = getClassNameNoPackage(cc.getClass());

			System.out.println("The area of this "+
								nameOfCurve+ 
								" is "+
								cc.computeArea());
							
		
		
		}
		
	}
	public static String getClassNameNoPackage(Class aClass){ 
        String fullClassName = aClass.getName();
        int index = fullClassName.lastIndexOf('.');
        String className = null;
        String packageName = null;
        
        
        //in this case, there is no package name
        if(index==-1) {
            return fullClassName;
        }
        else {
				  //for other apps, may be useful to have this
            packageName = fullClassName.substring(0,index);

            className = fullClassName.substring(index+1);
            return className;
        }    
	    	

	}

}
