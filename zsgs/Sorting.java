package org.task1.zsgs;

import java.util.Arrays;

public class Sorting {
	
	
	public static int[ ] insertionSort(int[]arr){
		for(int i=1;i<arr.length;i++) {
			int j=i;
			while((j>0)&&(arr[j-1]>arr[j])) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1]= temp;
				j--;
			}
		}
		return arr;
	}
	
	
	public static int[] bubbleSort(int[]arr) { //swap adjacent elements
		for(int i=0;i<arr.length;i++) {
			for(int j =1;j<arr.length-i;j++){
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static int[] selectionSort(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
				
			}
		}
		return arr;
	}

	public static void main(String[]args) {
		int[] arr = new int[] {2,6,5,1,3,4};  
		//arr = insertionSort(arr);
		//arr = bubbleSort(arr);
		arr = selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
