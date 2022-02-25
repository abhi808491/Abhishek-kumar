package com.cg.eis.service;

import java.util.HashMap;
import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class Service implements EmployeeService {
	HashMap<Integer,Employee> employees=new HashMap<>();
	Scanner sc=new Scanner(System.in);
	

	@Override
	public void getEmpDetails() {
		System.out.println("Enter the name of the employee");
		String name=sc.nextLine();
		System.out.println("Enter the id of the employee");
		int id=sc.nextInt();
		System.out.println("Enter the salary of the employee");
		double salary=sc.nextDouble();
		System.out.println("Enter the designation of the employee");
		sc.nextLine();
		String designation=sc.nextLine();
		Employee emp=new Employee(name,id,salary,designation);
		 findInsScheme( emp,salary);
		employees.put(id, emp);
		
		
		
	}

	@Override
	public void findInsScheme(Employee emp,double salary) {
		if(salary>5000 && salary>20000)
		{
			emp.setInsuranceScheme("Scheme C");
			System.out.println("you are eligible for :"+emp.getInsuranceScheme());
		}
		else if(salary>=20000 && salary<40000)
		{
			emp.setInsuranceScheme("Scheme B");
			System.out.println("you are eligible for :"+emp.getInsuranceScheme());
			
		}
		else if(salary>=40000)
		{
			emp.setInsuranceScheme("Scheme B");
			System.out.println("you are eligible for :"+emp.getInsuranceScheme());
		}
		else if(salary < 5000)
		{
			emp.setInsuranceScheme("No Scheme ");
			System.out.println("you are eligible for :"+emp.getInsuranceScheme());
			
		}
		
	}

	@Override
	public void displayDetails() {
		System.out.println("Enetr Employee id");
		int id=sc.nextInt();
		if(employees.containsKey(id))
		{
			System.out.println(employees.get(id));
		}
		else 
		{
			System.out.println("Employee not found");
		}
		
	}
	

}
