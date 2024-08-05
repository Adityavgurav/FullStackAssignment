package assignment7;
import java.util.*;

public class PrimeNumber {
	public static void main(String args[]) {
		int i=0;
		int j=0;
		String primeNum="";
		
		for(i=1;i<=100;i++) {
			int counter=0;
			for(j=i;j>=1;j--) {
				if(i%j==0) {
					counter=counter+1;
				}
			}
			
			 if(counter==2) {
				 primeNum = primeNum+i+" "+" ";
			 }
		}
		 
		 System.out.println("Prime Number From 1 to 100 are:");
		 System.out.println(primeNum);
	}

}
