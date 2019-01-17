package arrayListfunc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ModifyArrayListException {
	public static void main(String[] args) {
		List<String> myCityNames = new ArrayList<String>(2);
		myCityNames.add("Delhi");
		myCityNames.add("SanFran");
		myCityNames.add("punjab");
		myCityNames.add("haryana");
		myCityNames.add("uttar pradesh");
		System.out.println(myCityNames);
		//String removeCity = myCityNames.remove(3);
		//System.out.println("removed the city named " + removeCity + " from my array list , thankyou !!");

		for(String name:myCityNames) {
			System.out.println("city name is  "+name);
		}
		Iterator<String> itr= myCityNames.iterator();
		ListIterator<String> ltr= myCityNames.listIterator();
//		while(itr.hasNext()) {
//			String city= itr.next();
//			if(city.equals("punjab")) {	
//			itr.remove();
//			
//			
//		}
		//adds an element demon to the list
			ltr.add("demon");
		
		
		System.out.println("thanks for coming");
		myCityNames.removeIf((String name)->name.equalsIgnoreCase("haryana"));
		System.out.println(myCityNames);
	}
	
}
