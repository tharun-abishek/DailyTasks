package org.task1.zsgs;
import java.util.*;

public class ArrayPractice_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n =sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[]arr= new int[n];
		for(int i=0;i<n;i++) {
		  arr[i]=sc.nextInt();
		  }
		  Arrays.sort(arr);
	    int[]b= new int[n/2];
	    int[]a= new int[arr.length-b.length];
	    int[]result=new int[arr.length];
	    for(int i=0;i<b.length;i++) {
	    	if(b.length%2!=0) {
	    		b[i]=arr[b.length+i+1];	
	    	}
	    	else
	    		b[i]=arr[b.length+i];
	    }
	    
	    for(int i=0;i<a.length;i++) {
	    	a[i]=arr[a.length-1-i];
	    }
	    for(int i=0;i<n;i=i+2) {
          result[i]=a[(i-(i/2))];
	    }
        for(int i=1;i<n;i=i+2) {	
         result[i]=b[(i-1)-i/2];        
        }
	    for(int i=0;i<n;i++) {
	    	System.out.print(result[i]+" ");
	    }
     }
}

/*  Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int array1[]=new int[n];
int array2[]=new int[n];
for(int i=0;i<n;i++){
  array1[i] = sc.nextInt();
}
Arrays.sort(array1);
int ascending,descending;
if(n%2 == 0){
   ascending = n/2-1;
   descending = n/2;
}
else{
  ascending = n/2;
  descending = n-ascending;
  
}
  
for(int i=0;i<n;i++){
  if(i%2==0){
    array2[i] = array1[ascending];
    --ascending;
  }
  else{
    array2[i] = array1[descending];
    ++descending;
  }
}
for(int i=0;i<n;i++){
  System.out.print(array2[i]);
}
}
}*/