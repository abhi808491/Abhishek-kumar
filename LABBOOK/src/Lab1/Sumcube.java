package Lab1;

import java.util.Scanner;

public class Sumcube {
	public static void main(String [] args)
	{
		int n;
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(cube(n));
		
		
	}
 public static int cube(int n)
 {
	 int sum=0;
	 for(int i=1;i<=n;i++)
	 sum=sum+(i*i*i);
	 return sum;
 }
}
