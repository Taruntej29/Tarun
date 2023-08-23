package Polymorphism;
import java.util.Scanner;
public class User 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String u = sc.nextLine();
	    sc.close();
	    System.out.println("You entered: "+u);
	}
}
