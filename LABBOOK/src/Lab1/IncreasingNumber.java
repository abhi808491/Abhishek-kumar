package Lab1;

import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(checkNumber(n));

	}
	public static boolean checkNumber(int n)
	{
		boolean flag=true;
		int digit=n%10;//2
		n=n/10;//21
		while(n>0)
		{
			if(digit<n%10)
			{
				flag=false;
				break;
			}
			digit=n%10;
			n=n/10;
		}
		return flag;
	}

}
