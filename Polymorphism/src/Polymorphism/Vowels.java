package Polymorphism;
import java.util.Scanner;
public class Vowels 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		sc.close();
		input = input.toLowerCase();
		int vowelCount = 0;
	    int consonantCount = 0;
	    int digitCount = 0;
	    int spaceCount = 0;
	    for (int i = 0; i < input.length(); i++) 
	    {
	    	char ch = input.charAt(i);
	        if (ch >= 'a' && ch <= 'z') 
	        {
	        	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
	        	{
	        		vowelCount++;
	                } else {
	                    consonantCount++;
	                }
	          	}
	            if (Character.isDigit(ch)) {
	                digitCount++;
	            }
	            if (Character.isWhitespace(ch)) {
	                spaceCount++;
	            }
	        }
	        System.out.println("Number of vowels: " + vowelCount);
	        System.out.println("Number of consonants: " + consonantCount);
	        System.out.println("Number of digits: " + digitCount);
	        System.out.println("Number of white space characters: " + spaceCount);
	    }
}
