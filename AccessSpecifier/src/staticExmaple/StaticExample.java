package staticExmaple;

public class StaticExample {

	private static int num = 0;
	int num1 = 1;

	public StaticExample() {
		num++;
		num1 += 5;
		System.out.println(" num is:::" + num + "\\\\\\num1 is::::   " + num1);
	}

	public static void main(String[] args) {
		StaticExample st = new StaticExample();
		StaticExample st1 = new StaticExample();
		StaticExample st2 = new StaticExample();
		StaticExample st3 = new StaticExample();
		StaticExample st4 = new StaticExample();
		StaticExample st5 = new StaticExample();
		StaticExample st6 = new StaticExample();
		
		StaticExample st7 = new StaticExample();
		StaticExample st8 = new StaticExample();
		StaticExample st9 = new StaticExample();
		StaticExample st10= new StaticExample();
		StaticExample st11= new StaticExample();

	}
}
