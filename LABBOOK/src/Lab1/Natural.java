package Lab1;

import java.util.Scanner;

public class Natural {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(calculateSum(n));
	}
	public static int calculateSum(int n)
	{
		int count=0;
		int sum=0;
		int i=0;
			while(count<=n)
			{
				if(i%3==0 || i%5==0)
				{
					sum=sum+i;
					count++;
				}
				i++;
		}
		return sum;
		

	}
}

