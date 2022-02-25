package Lab1;

import java.util.Scanner;

public class CalculateDifference {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(calculateDifference(n));
		
	}
    public static int calculateDifference(int n)
    {
    	int diff=0;
    	int sum1=0,sum2=0,sum3=0;
    	
    	for(int i=1;i<=n;i++)
    	{
    		 sum1=sum1+(i*i);
    		 sum2=sum2+i;
    		 
    	}
    	
    	sum3=sum2*sum2;
    	diff=sum1-sum3;
    	return diff;
    }
}
