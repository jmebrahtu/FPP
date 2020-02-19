package lab5.pro2.innerclass;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;

	Top() {
		mid = new Middle();
     midbot = mid.new Bottom();
	}

   //returns the value in the instance vble of Bottom
	int readBottom() {
		// implement
		return midbot.b;
	}

	class Middle {
		int m = 2;

//returns sum of instance vble in Top and
//instance vble in Bottom
		int addTopAndBottom() {
			// implement
			//Bottom k = new Bottom();
			//int z = t + k.b;
			//return z;
			return Top.this.t+Top.this.readBottom();
		}

		class Bottom {
			int b = 3;

//returns the product of the instance vbles in all three classes

			public int multiplyAllThree() {

				int Mult = b * Middle.this.m * Top.this.t;

				return Mult;
			}
		}
	}

	public static void main(String[] args) {
		Top top = new Top();  
		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());
	}
}