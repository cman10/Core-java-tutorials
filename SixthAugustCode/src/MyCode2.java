import java.util.Scanner;

public class MyCode2 {

	public static void searchMe(int arr[]){
		int size=arr.length;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the value to search");
		int value=in.nextInt();
				
		
		for(int i=0;i<size;i++){
			if(value==arr[i]);
			System.out.println("value found at"+arr[i]);
			
		}
		
	}
	
	
}
