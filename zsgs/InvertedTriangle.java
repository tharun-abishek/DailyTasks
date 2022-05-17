package org.task1.zsgs;

import java.util.Scanner;

public class InvertedTriangle {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows: ");
		Scanner sc = new Scanner(System.in);
		int rows=sc.nextInt();
		
		for(int i=rows;i>=1;i--)
		{
			for(int j=rows-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>0;k--) {
			 System.out.print("* ");
		    }
			System.out.println();
	     }

	}

}
