//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		StringOddOrEven input = new StringOddOrEven("cat");
		out.print("Enter a word :: ");
		String check = keyboard.nextLine();
		input.setString(check);
		input.isEven();
		out.print(input.toString());
	}
}