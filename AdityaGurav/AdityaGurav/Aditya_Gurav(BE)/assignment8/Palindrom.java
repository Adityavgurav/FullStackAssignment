package assignment9;
import java.util.Scanner;

public class Palindrom {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int sum=0;
		int r;
		while(n>0) {
			r=n%10;
			 sum=(sum*10)+r;
			 n=n/10;
		}
		
		if(sum==n) {
			System.out.println("Given number is palindrom");
		}
		else {
			System.out.println("Given number is not palindrom");
		}
	}

}
