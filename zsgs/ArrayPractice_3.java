package org.task1.zsgs;
import java.util.*;
public class ArrayPractice_3 {
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word: ");
		String input= sc.next();
		int length=input.length();
		char givenWord[]=new char[length];
		if(length%2==0)
			System.out.println("0");
		else {
		for(int i =0;i<length;i++)
		{
			givenWord[i]=input.charAt(i);
		}
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				if(i==j)
				{
					System.out.print(givenWord[i]);
				}
				
				else if(i+j==(length-1))
				{
					System.out.print(givenWord[j]);
				}
				else
				{
					System.out.print(" ");
				}
				
			
		}
			System.out.println();
		}	
	}
	
	}
	}


