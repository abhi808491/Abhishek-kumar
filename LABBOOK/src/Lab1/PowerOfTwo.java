package Lab1;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(checkNumber(n));

	}
	public static boolean checkNumber(int n)
	{
		boolean b=false;
		for(int i=0;i<=n;i++)
		if(Math.pow(2,i)==n)
		{
			b=true;
		}
		return b;
	}

}
