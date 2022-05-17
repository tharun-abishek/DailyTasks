package org.task1.zsgs;
import java.util.*;

public class ArrayPractice_2 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int noOfElements = in.nextInt();
		int[] a = new int[noOfElements];
		
		for(int i=0;i<noOfElements;i++) {
			a[i]=in.nextInt();
		}
		int[] sum= new int[a.length];
		for(int i=1;i<noOfElements;i++) {
		
			for(int j=1;j<=a[i];j++) {
				if((j*j)==a[i]){
				sum[i]+=5;
				break;
				}
			}
				if ((a[i]%4==0)&&(a[i]%6==0)) 
			    sum[i]+=4;
				 
				else if(a[i]%2==0)
				sum[i]+=3;
		}
				
				  Sort(sum,a);
			        
			        for(int i =0;i<noOfElements;i++){
			            System.out.print("<"+a[i]+","+sum[i]+"> ");
			        }
			    }

			    public static void Swap(int[] a, int i, int max_I) {
			        int temp = a[i];
			        a[i] = a[max_I];
			        a[max_I] = temp;
			    }

			    public static void  Sort(int []a,int []b) {
			        int n = a.length;
			        for (int i = 0; i < n - 1; i++) {
			            int max_i = i;
			            for (int j = i + 1; j < n; j++) {
			                if (a[max_i] < a[j]) {
			                    max_i = j;
			                }
			            }
			            Swap(a, i, max_i);
			            Swap(b,i,max_i);
			        }
			      
			       
			    }
			}
			
	

