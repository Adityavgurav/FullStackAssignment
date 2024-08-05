package assignment4;

public class Swapping {
	
		public static void main(String args[])
		{
			int x=10;
			int y=15;
			System.out.println("before Swappig");
			System.out.println("x:"+x);
			System.out.println("y:"+y);
		
			x=x+y;
			y=x-y;
			x=x-y;
			System.out.println("After Swapping");
			System.out.println("x:"+x);
			System.out.println("y:"+y);
		}
		
		

}
