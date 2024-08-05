package third;
import java.util.Scanner;
public class Searching {
 public static void main(String args[]) {
	 
	 Scanner sc=new Scanner(System.in);
	 int a[]=new int [7];
	 int counter=0;
	 
	 System.out.println("enter elements");
	 
	 for(int i=0;i<7;i++) {
		 a [i]=sc.nextInt();
	 }
	 
	 
	 for(int i=0;i<7;i++) {
		 System.out.println("Elements are;"+a[i]); 
	 }
	 
	 System.out.println("enter searching element");
	 int n=sc.nextInt();
	 for(int i=0;i<7;i++) {
		 if(a[i]==n) 
			 counter++;
		 {
			 if(counter>0)
			 {
				System.out.println("  Bhetla"); 
			 }
			 else
			 {
				 System.out.println(" Nahi Bhetla"); 
			 }
		 }
	 }
 }
 
 
}
