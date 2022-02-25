package com.cg.eis.bean;

public class Employee {

private String name;
private int id;
private double salary;
private String designation;
private String insuranceScheme;
public Employee(String name, int id, double salary, String designation) {
	super();
	this.name = name;
	this.id = id;
	this.salary = salary;
	this.designation = designation;
}
public String getInsuranceScheme() {
	return insuranceScheme;
}
public void setInsuranceScheme(String insuranceScheme) {
	this.insuranceScheme = insuranceScheme;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", designation=" + designation
			+ ", insuranceScheme=" + insuranceScheme + "]";
}

}
