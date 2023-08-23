package Polymorphism;
public class Person_t
{
	int age;
	String name;
	Person_t(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("Person name is: "+name+" and Age is: "+age);
	}
}
class Student extends Person_t
{
	int Roll_Number;
	Student(int Roll_Number,String name,int age )
	{
		super(name,age);
		this.Roll_Number=Roll_Number;
	}
	public void show()
	{
		System.out.println("Roll_Number is :"+Roll_Number);
	}
}
class Teacher extends Person_t
{
	String subject;
	Teacher(String subject,String name,int age)
	{
		super(name,age);
		this.subject=subject;
	}
	public void display()
	{
		System.out.println("Subject is: "+subject);
	}
	public static void main(String[] args) 
	{
		Student s=new Student(558,"Tarun",21);
		s.display();
		s.show();
		Teacher t=new Teacher("BDA","Upendra",32);
		t.display();
	}
}
