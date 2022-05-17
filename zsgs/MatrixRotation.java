package org.task1.zsgs;

public class MatrixRotation {
	static int n=4;
	static void print(int mat[][]) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) { 
				System.out.print( mat[i][j]+" ");	
			}
			System.out.println();
		}
	
	}
	static void rotate90clockwise(int mat[][]){
		//for transposing matrix
		for(int i=0;i<n;i++) 
			for(int j=i+1;j<n;j++) {
				int t = mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=t;		
			}
		
		// for reversing individual row
		for(int i=0;i<n;i++) {
			int low=0,high=n-1;      //j=low;high=k
			while(low<high) {        //for(int j =0,k=n-1;j<n;j++,k--)
				int t = mat[i][low];
				mat[i][low]=mat[i][high];
				mat[i][high]=t;
				low++;
				high--;
			}
		}
	}
	
	public static void main(String[] args) {
		int mat[][]= {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		rotate90clockwise(mat);
		print(mat);
		}
	}


