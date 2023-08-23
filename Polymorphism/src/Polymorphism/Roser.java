package Polymorphism;
import java.util.Scanner;
public class Roser 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your full name: ");
		String fullName = sc.nextLine();
		sc.close();
		String[] names = fullName.split(" ");
		StringBuilder abbreviation = new StringBuilder();
		for (int i = 0; i < names.length - 1; i++)
		{
			String name = names[i];
	        abbreviation.append(name.charAt(0)).append(".");
		}
		abbreviation.append(names[names.length - 1]);
	    System.out.println("Abbreviation: " + abbreviation);
	}
}
