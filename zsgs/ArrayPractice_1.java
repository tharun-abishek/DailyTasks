package org.task1.zsgs;
import java.util.*;

public class ArrayPractice_1 {
 public static void main(String[]args) {
	String[][]arr= {{"luke","shaw"},{"wayne","rooney"},
			 {"rooney","ronaldo"},{"shaw","rooney"}
			 };
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name whose granchildren count to find: ");
	String name = sc.next();
	int count=0;
	String childname =" ";
	for(int i=0;i<arr.length;i++) {
		if(name.equals(arr[i][1]))
			{childname=arr[i][0];
		    for(int j=0;j<arr.length;j++) {
		    	if(childname.equals(arr[j][1])) {
		    		count++;
		    }
		    }
	}
		    }
	System.out.println("Number of Grandchilds is "+count);
 }
}
	
	
	
	
	


