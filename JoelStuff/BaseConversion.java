
import java.util.Scanner;											//imports scanner class


public class BaseConversion
{
    public static void main(String [ ] args)
    {
        System.out.println("Welcome to Base Conversion");
        System.out.println("Please enter your base (2,10, or 16)");
        Scanner scan = new Scanner(System.in);
        int basein = scan.nextInt();									// Base is entered here
        System.out.println("Your base is "+basein);
        System.out.println("Please enter your number");
		int number = scan.nextInt();								// Number to be converted is entered here
		System.out.println("Your number is "+number);
		System.out.println("Please enter your desired base (2,10, or 16)");
		int baseout = scan.nextInt();
		
		// Start of conversion
		if (baseout == 2)
			Integer.toBinaryString(number);
			System.out.println("Your new base 2 number is:" +number);
		
    }
}