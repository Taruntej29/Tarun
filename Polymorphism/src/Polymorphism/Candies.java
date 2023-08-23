package Polymorphism;
import java.util.Scanner;
public class Candies 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sc.close();
        System.out.println("You entered: " + sentence);
	}
}
