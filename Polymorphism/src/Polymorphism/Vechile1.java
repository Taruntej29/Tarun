package Polymorphism;
public class Vechile1
{
	public void start()
	{
        System.out.println("Vehicle started");
    }
}
class Car extends Vehicle
{
	public void drive()
	{
        System.out.println("Car is being driven");
    }
}
class SportsCar extends Car
{
    public void accelerate()
    {
    	System.out.println("Sports car is accelerating");
    }
    public static void main(String[] args)
    {
    	SportsCar s = new SportsCar();
    	s.Start();
    	s.drive();
    	s.accelerate();
    }
}

