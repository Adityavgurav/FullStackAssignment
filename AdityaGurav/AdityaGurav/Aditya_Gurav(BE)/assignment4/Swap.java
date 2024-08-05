package assignment4;

public class Swap {
	public static void main(String args[])
	{
		int x=100;
		int y=200;
		System.out.println("before Swappig");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
	int temp=x;
	x=y;
	y=temp;
	System.out.println("After swapping");
	System.out.println("x:"+x);
	System.out.println("y:"+y);
	
	}

}
