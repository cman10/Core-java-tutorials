
public class Mycode {
	
	public static int sumArray(int arr[]){
		int size=arr.length;
		int Sum=0;
		int index=0;
		for(index=0;index<size;index++)
		Sum=Sum+arr[index];
		return Sum;
		
		
	}

	public static void main(String[] args) {
		int arr[]={2,3,4,5,6,7,8};
		System.out.println("sum of the elements of array is :"+sumArray(arr));

	}

}
