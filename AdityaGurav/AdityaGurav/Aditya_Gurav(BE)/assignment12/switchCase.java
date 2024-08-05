package assignment9;
import java.lang.Math;
import java.util.Scanner;
public class switchCase {
	public static void main(String args) {
		double r=2,area,perimeter,circumference;
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("You can select option");
		System.out.println("1.Circle \n2.Rectangle");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println("What you want to calculate ?");
			System.out.println("1.Area \n2. Circumference");
			System.out.println("Enter your choice :");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				{
				area= Math.PI *r*r;
				System.out.println("Area of circle is :"+area);
				break;
			}
				case 2:
				{
					circumference= 2*Math.PI*r;
					System.out.println("Circumference of circle is :"+circumference);
					break;
				}
		}
	}
		case 2:
		{
			int l=10,b=5;
			System.out.println("What you want to calculate ?");
			System.out.println("1.Area \n2. Perimeter");
			System.out.println("Enter your choice :");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				area=l*b;
				System.out.println("Area of rectangle is :"+area);
				break;
			}
			case 2:
			{
				perimeter= 2*(l+b);
				System.out.println("Perimeter of rectangle is :"+perimeter);
				break;
			}
			}
			break;
		}
		   default:
		   {
			   System.out.println("Choice is wrong......try again");
		   }
		   sc.close();
	}


			
			
			
		}

}
