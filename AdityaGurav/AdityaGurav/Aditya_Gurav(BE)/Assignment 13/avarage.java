package third;
import java.util.Scanner;

public class avarage {
 public static void main(String args[]) {
	 int a[]=new int[3];
	 int sum=0;
	 int avg=0;
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter elements of an array \n");
	 for(int i=0;i<3;i++) {
		 a[i]=sc.nextInt();	 
	 }
	 System.out.print("array elements");
	 for(int i=0;i<3;i++) {
		 System.out.print(a[i]+" ");
		sum = a[i]+sum;
		avg=sum/a[i];
		
		 
	 }
	 System.out.println("\n Addition of array"+sum);
	 System.out.println("\n Avarage of array"+avg);

 }
 }
