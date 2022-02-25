package Lab5;

import java.util.Scanner;

public class PersonName {
	String n1;
	String n2;
	PersonName(){}
	PersonName(String n1,String n2) throws NameException
	{
	
		this.n1=n1;
		this.n2=n2;
		
			if(n1.equals(""))
			{
				throw new NameException("enter valid firstname");
			}
			else if(n2.equals(""))
			{
				throw new NameException("enter valid last name");
			}
			
			else
			{
				System.out.println("Full Name is" +n1+" "+n2);
			}
		}
	
public static void main(String[] args)
{
	try
	{
	Scanner sc=new Scanner(System.in);
	String firstName=sc.nextLine();
	String lastName=sc.nextLine();
	PersonName pn=new PersonName(firstName,lastName);
 }
catch(Exception e)
{
	e.printStackTrace();
}

}
}
class NameException extends Exception
{
	NameException(String msg)
	{
		super(msg);
	}
}
