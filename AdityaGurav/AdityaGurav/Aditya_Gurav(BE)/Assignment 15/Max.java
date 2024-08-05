package third;
import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		int a[]=new int [4];int i;int max;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements");
		for(i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
			
		}
		max=a[0];
		for(i=1;i<4;i++)
		{
			if(a[i]>max) {
				max=a[i];
			}
		
		}
		System.out.println("maximum number is :"+ max); 
		
		
	}

}
