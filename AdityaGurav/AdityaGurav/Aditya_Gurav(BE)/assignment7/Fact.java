package assignment6;
import java.util.Scanner;

public class Fact {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i,fact=1;
		System.out.println("Enter the number:");
		int b=sc.nextInt();
		 
		for(i=1;i<=b;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is:"+fact);
		
		
	}
	

}
