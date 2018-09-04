package returnBestPrac;

public class ReturnClass {
public String getnumber(int number){
	String defaultnum="zero";
	if(number==1){
		 defaultnum="one";
		 System.out.println(defaultnum);
	}
	if(number==2){
		 defaultnum="two";
		 System.out.println("two");
	}
	if(number==3){
		 defaultnum="THREE";
	}
	return defaultnum;
	
}
public static void main(String[] args) {
	ReturnClass c= new ReturnClass();
	c.getnumber(2);
}
}
