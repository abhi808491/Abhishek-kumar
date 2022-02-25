package com.cg.eis.pi;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class EmployeeApp  {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Service se=new Service();
		while(true)
		{
			System.out.println("Enter the choice\n"+"Press1 for creating new employee \n"+"Press2 for getting employee details\n");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:se.getEmpDetails();
				break;
			case 2:se.displayDetails();
				break;
			default:
				System.out.println("Enter valid detail");
			
			}
		}

	}

}
