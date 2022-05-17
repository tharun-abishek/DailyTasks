package org.task1.zsgs;
import java.util.*;

public class ArrayPractice_4 {

	public static void main (String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of rows in matrix_1:");
		int matrix_1Row = input.nextInt();
		System.out.print("Enter the number of column in matrix_1:");
		int matrix_1Column = input.nextInt();
		System.out.print("Enter the number of rows in matrix_2:");
		int matrix_2Row = input.nextInt();
		System.out.print("Enter the number of column in matrix_2:");
		int matrix_2Column = input.nextInt();
		int[][] matrix_1 = new int[matrix_1Row][matrix_1Column];
		int[][] matrix_2 = new int[matrix_2Row][matrix_2Column];
		
		if (matrix_1Column == matrix_2Row ) {
			int[][] result = new int [matrix_1Row][matrix_2Column];
			System.out.println("Enter the value for first matrix");
			for (int i = 0; i < matrix_1Row; i++) {
				for (int j = 0; j < matrix_1Column; j++) {
					System.out.print("Enter the value for row: " + (i + 1) + " column: " + (j + 1) + " :");
					matrix_1[i][j] = input.nextInt();
				}
				System.out.println();
			}
			
			
			System.out.println("Enter the value for second matrix");
			for (int i = 0; i < matrix_2Row; i++) {
				for (int j = 0; j < matrix_2Column; j++) {
					System.out.print("Enter the value for row: " + (i + 1) + " column: " + (j + 1) + " :");
					matrix_2[i][j] = input.nextInt();
				}
			}
		
			System.out.print("the multipication of given two array is :\n");
			for (int i = 0; i < matrix_1Row; i++) {
				for (int j = 0; j < matrix_2Column; j++) {
					for(int k=0;k<matrix_2Row;k++)
					result[i][j]+=(matrix_1[i][k]*matrix_2[k][j]);
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
		}
}
		
		else
			System.out.println("Matrix multiplication is not possible"
					+ " ");
	}
}