package Polymorphism;
class Person
{
	String name;
	Person(String name)
	{
		this.name=name;
	}
	void displayInfo()
	{
		System.out.println("The person name is: "+name);
	}
}
class Employee extends Person
{
	double salary;
	Employee(String name,double salary)
	{
		super(name);
		this.salary=salary;
	}
	void displaySalary()
	{
		System.out.println("Salary of an employee is: "+ +salary);
	}	
}
class Manager extends Employee 
{
	String department;
	Manager(String name, double salary,String department)
	{
		super(name,salary);
		this.department=department;
	}
	void displayDepartment()
	{
		System.out.println("Department of an employee is: "+department);
	}	
	public static void main(String[] args) 
	{		
		Manager m=new Manager("Tarun",50000,"FullStack Developer");
			m.displayInfo();
			m.displaySalary();
			m.displayDepartment();
	}
}
