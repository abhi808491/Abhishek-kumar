package Lab9;

import java.util.Scanner;

interface intrf
{
	double getPower(double n,double m);
}

public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double n=sc.nextDouble();
		double m=sc.nextDouble();
		intrf ref=(a,b)->  Math.pow(a, b);
		System.out.println(ref.getPower(n, m));

	}

}
