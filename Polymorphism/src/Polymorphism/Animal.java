package Polymorphism;
class Animal 
{
	void eat()
	{
		System.out.println("Animal is");	
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog");
	}
}
class Labrador extends Dog
{
	void displayColor()
	{
		System.out.println("Color is: Brown and Black");
	}
	public static void main(String[] args) 
	{
		Labrador l=new Labrador();
		l.eat();
		l.bark();
		l.displayColor();

	}

}

