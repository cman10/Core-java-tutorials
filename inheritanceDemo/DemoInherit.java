package inheritanceDemo;

//demo to explain inheritance in java 
//base class 
public class DemoInherit {
	public int val1;
	public int val2;

	public int Addition() {
		int sum = val1 + val2;
		return sum;

	}

	public int Subtraction() {

		int diff = val1 - val2;
		return diff;

	}

//inherits base class and get its methods 
	//

	public class Scientificcalc extends DemoInherit {
		public double calculSin() {
			double SinVal = Math.sin(val1);
			return SinVal;

		}

		public double calculCos() {
			double Cos = Math.sin(val2);
			return Cos;

		}

	}
	
	public static void main(String[] args) {
		
	}

}
