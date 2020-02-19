package prob3;

public class Driver {

	
		public static void main(String[] args) {
			Figure[] f = new Figure[5];
			f[0] = new UpWardHat();
			f[1] = new UpWardHat();
			f[2] = new DownWardHat();
			f[3] = new FaceMaker();
			f[4] = new Vertical();
			System.out.println("Figures");
			for (Figure f2 : f) {
				f2.getFigure();
			}
			System.out.println();
			System.out.println("=============================");
			System.out.println();
			for (Figure f2 : f) {
				System.out.print(f2.getClass().getSimpleName() + ":");
				f2.getFigure();
				System.out.println();
			}
		}
	

	}


