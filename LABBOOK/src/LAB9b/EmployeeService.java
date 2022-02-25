package LAB9b;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService  {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
	
		
		EmployeeRepositry er=new EmployeeRepositry();
		er.createEmployee("18bcs1770","Abhishek","Kumar","abhi808491@gmail.com","7004657498", null, null, null, 0, null);
		
	}


}

