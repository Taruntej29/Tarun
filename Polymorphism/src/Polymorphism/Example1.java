package Polymorphism;
public class Example1 extends Runable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("The i value is "+i);
		}
	}

	public static void main(String[] args) 
	{
		Example1 t = new Example1();
		Thread obj = new Thread();
		obj.start();
	}
}
