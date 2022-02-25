package Lab9;

import java.util.Scanner;
interface interf5
{
	int calFact(int n);
}

public class Factorial {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Factorial fa=new Factorial();
		interf5 f=fa::fact;
		System.out.println(f.calFact(n));
		
	}
	
		int fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			 fact=fact*i;
		}
		return fact;
	}

}
