package Lab5;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		try
		{
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		Employee emp=new Employee();
		emp.salaryValidation(salary);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	int salaryValidation(int n) throws Exception
	{
		
		if(n<=3000)
		{
			throw new EmployeeException("Enter a valid salary");
		}
		else
			System.out.println("Salary validate");
		
		return n;
	}

}
class EmployeeException extends Exception
{
	EmployeeException(String msg)
	{
		super(msg);
	}
}
