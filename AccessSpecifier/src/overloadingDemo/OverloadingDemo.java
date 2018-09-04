package overloadingDemo;

public class OverloadingDemo {

	void getnum(int num) {
		System.out.println("no params to give");
	}

	void getnum(String name) {
		System.out.println("my name is " + name);
	}

	void getnum(char ch) {
		System.out.println("here param is a char :::: " + ch);

	}

	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		od.getnum(1);
		od.getnum("manik");
		od.getnum('a');
	}
}
