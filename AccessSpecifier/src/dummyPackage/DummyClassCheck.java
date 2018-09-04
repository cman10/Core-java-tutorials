package dummyPackage;
import demoAcessSpecifier.*;
//Default was there so demo could not be inherited in subclass of different package 
//making demo public will do the job 
public class DummyClassCheck extends Demo{
	//could use whatsmyname because i made it public 
@Override
public void whatsMyname() {
	// TODO Auto-generated method stub
	super.whatsMyname();
}


public static void main(String[] args) {
	Demo d= new Demo();
	d.whatsMyname();
	//got the output after using above function "My name is mogambo": !! 
	
	DummyClassCheck dc1= new DummyClassCheck();
	dc1.whatsMyname();
}
}

