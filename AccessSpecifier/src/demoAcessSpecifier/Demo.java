package demoAcessSpecifier;

//default example
public class Demo {
	int rollNum;
	String name;

	public void whatsMyname() {
		System.out.println("My name is mogambo");
	}

	public void invisibleMethod() {

		System.err.println("Error i am protected dude , stay away! ");
	}

	protected void invisibleMethod1() {

		System.out.println("Hi, i am back! ");
	}

}
