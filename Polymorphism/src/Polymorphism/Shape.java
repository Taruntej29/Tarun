package Polymorphism;
class Shape 
{
	void draw()
	{
		System.out.println("Drawing the shape");
	}
}
class circle extends Shape
{
	void Shape()
	{
		System.out.println("Shape is Circle");
	}
}
class ColoredCircle extends circle 
{
	String color;
	void setcolor(String color)
	{
		this.color=color;
	}
	void display()
	{
		System.out.println("Color is "+color);
	}
	public static void main(String[] args) 
	{
		ColoredCircle c=new ColoredCircle();
		c.draw();
		c.Shape();
		c.setcolor("Blue");
		c.display();
	}
}
