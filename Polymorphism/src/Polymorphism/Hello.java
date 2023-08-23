package Polymorphism;
public class Hello 
{
	public static void main(String[] args) 
	{
        String originalString = "Hello, have a good day";
        String stringWithoutConsonants = originalString.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");
	    System.out.println("Original string: " + originalString);
	    System.out.println("String without consonants: " + stringWithoutConsonants);
	    }
}
