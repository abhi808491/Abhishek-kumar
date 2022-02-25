package Lab5;

import java.util.Scanner;

public class AgeValidation {
public static void main(String[] args)
{
	try
	{
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	AgeValidation v=new AgeValidation();
	v.ageVal(age);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}	
}
 int ageVal(int n) throws Exception
{
	if(n<=15)
	{
		throw new Age("Age should be greater then 15");
	}
	else
	{
		System.out.println("Age is correct");
	}
	 return n;
}
 
}
class Age extends Exception
{
	Age(String msg)
	{
		super(msg);
	}
}
