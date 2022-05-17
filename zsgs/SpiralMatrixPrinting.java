package org.task1.zsgs;

public class SpiralMatrixPrinting {
    static void spiralprint(int n ,int a[][]) {
    int T,B,L,R,dir;
    T=0;
    B=n-1;
    L=0;
    R=n-1;
    dir=0;
    int i;
    
    while(T<=B && L<=R)
    {
        if(dir==0)
        {
            for(i=L;i<=R;i++)
            	System.out.print(a[T][i]+" ");
   
            T++;
        }
        else if(dir==1)
        {
            for(i=T;i<=B;i++)
            	System.out.print(a[i][R]+" ");
     
            R--;
        }
        else if(dir==2)
        {
            for(i=R;i>=L;i--)
            	System.out.print(a[B][i]+" ");
            
            B--;
        }
        else if(dir==3)
        {
            for(i=B;i>=T;i--)
            	System.out.print(a[i][L]+" ");
 
            L++;
        }
        dir=(dir+1)%4;
    }
    
}
    public static void main(String[] args) {
		int n =4;
		int a[][]= {{1,2,3,4},
				   {5,6,7,8},
				   {9,10,11,12},
				  {13,14,15,16}};
	    spiralprint(n,a);
	}

}
