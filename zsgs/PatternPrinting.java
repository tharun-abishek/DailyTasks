package org.task1.zsgs;
import java.util.Scanner;

public class PatternPrinting {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows: ");
		Scanner sc = new Scanner(System.in);
		int rows=sc.nextInt();
		
		for(int i=0;i<rows;i++)
		{
			for(int j=rows-i;j>1;j--)
			{
				System.out.print(" ");
		}
			for(int k=0;k<=i;k++) {
			 System.out.print("* ");
		    }
			System.out.println();
	}
		
	}
}

