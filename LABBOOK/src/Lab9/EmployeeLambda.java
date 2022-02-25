package Lab9;
interface intrf5
{
	Employee3 getEmployee(String name,String id);
}

public class EmployeeLambda {

	public static void main(String[] args) {
		intrf5 in=Employee3::new;
		Employee3 emp1=in.getEmployee("Abhishek","18bcs1770");
		Employee3 emp2=in.getEmployee("Vivek","18bcs1769");
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		

	}

}
class Employee3
{
	String name;
	String id;
	public Employee3(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee3 [name=" + name + ", id=" + id + "]";
	}

	
}
