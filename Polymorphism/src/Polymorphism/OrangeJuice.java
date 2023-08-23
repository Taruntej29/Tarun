package Polymorphism;
public class OrangeJuice
{
	public static void main(String[] args) 
	{
		String s= "This is orange juice";
		boolean isPresent = s.contains("orange");
	    if (isPresent)
	    {
	    	System.out.println("The word 'orange' is present in the sentence.");
	    	} else {
	    		System.out.println("The word 'orange' is not present in the sentence.");
	    		}
	}

}
