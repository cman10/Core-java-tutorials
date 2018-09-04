package dummyPackage;

import demoAcessSpecifier.*;

import demoAcessSpecifier.Demo;

class ProtectedDemo extends Demo {

	public static void main(String[] args) {

		ProtectedDemo pd = new ProtectedDemo();
		pd.invisibleMethod();
		pd.invisibleMethod1();

		Demo d1 = new Demo();
		// started giving o/p as i made invisible method public ,
		// on private it gives us the error
		d1.invisibleMethod();
		// d1.invisibleMethod1(); it starts giving error and asks us to make the
		// method public
	}

}
