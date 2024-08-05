package third;
import java.util.Arrays;

public class Sort {
	public static void main(String args[]) {
		int array[]= {5,7,4,2,5,7,9};
		System.out.println("Original array: "+ Arrays.toString(array));
		
		//Sort the array
		Arrays.sort(array);
		
		//print the sort array
		System.out.println("Sorted Array is :"+Arrays.toString(array));
	}

}
