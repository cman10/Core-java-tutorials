package superDemo;

public class Subclass extends SuperKeywordDemo {

	public void printMethod() {

		super.printMethod();// this calls print method of parent class
		// so "super class method" is printed first 

		System.out.println("base class method is being called here ");

	}

	public static void main(String[] args) {
		Subclass s = new Subclass();
		s.printMethod();

	}

}
