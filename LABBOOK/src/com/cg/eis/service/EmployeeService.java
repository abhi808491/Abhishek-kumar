package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	public void getEmpDetails();
	public void findInsScheme(Employee emp,double salary);
	public void displayDetails();

}
