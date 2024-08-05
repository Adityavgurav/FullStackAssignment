package third;

import java.util.Scanner;

public class Arith {
	public static void main(String args[])
	 {
		int arr[][]=new int[3][3];
		int arr1[][]=new int[3][3];
		int store[][]=new int[3][3];
		int r,c;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 9 integer elements:");
		for(r=0;r<3;r++)
		{
			for(c=0;c<3;c++)
			{
				arr[r][c]=sc.nextInt();
				
			}
		}
		for(r=0;r<3;r++)
		{
			for(c=0;c<3;c++) {
				System.out.print("  "+ arr[r][c]);
			}
			System.out.print("\n");
		}
		System.out.println("Enter 9 integer elements:");
		for(r=0;r<3;r++)
		{
			for(c=0;c<3;c++)
			{
				arr1[r][c]=sc.nextInt();
				
			}
		}
		for(r=0;r<3;r++)
		{
			for(c=0;c<3;c++) {
				System.out.print("  "+ arr1[r][c]);
			}
			System.out.print("\n");
		}
		System.out.println("Addition is :");
		for(r=0;r<3;r++)
		{
			for(c=0;c<3;c++) {
				store[r][c]=arr[r][c]+arr1[r][c];
				System.out.print("  "+ store[r][c]);
			}
			System.out.print("\n");
		}
		
		System.out.println("Addition is :");
		for(r=0;r<3;r++)
		{
			for(c=0;c<3;c++) {
				store[r][c]=arr[r][c]+arr1[r][c];
				System.out.print("  "+ store[r][c]);
			}
			System.out.print("\n");

	 }
		System.out.println("Subtraction is :");
		for(r=0;r<3;r++)
		{
			for(c=0;c<3;c++) {
				store[r][c]=arr[r][c]-arr1[r][c];
				System.out.print("  "+ store[r][c]);
			}
			System.out.print("\n");
}
		System.out.println("Division is :");
		for(r=0;r<3;r++)
		{
			for(c=0;c<3;c++) {
				store[r][c]=arr[r][c]/arr1[r][c];
				System.out.print("  "+ store[r][c]);
			}
			System.out.print("\n");
}
	 }	
}

