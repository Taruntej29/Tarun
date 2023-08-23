package Polymorphism;

class Vehicle
{
	public void Start()
	{
		System.out.println("The vehicle is: ");
	}
}
class car extends Vehicle 
{
	public void drive()
	{
		System.out.println("Car");	
	}
}
class Bike extends Vehicle 
{
	public void ride()
	{
		System.out.println("Bike");
	}
	public static void main(String[] args) 
	{
		car c=new car();
		c.Start();
		c.drive();
		Bike b=new Bike();
		b.Start();
		b.ride();
	}
}

