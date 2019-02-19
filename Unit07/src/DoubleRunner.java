//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;
import java.util.Scanner;
public class DoubleRunner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		int x = 0;
		double one = 0, two = 0, three = 0, four = 0;
		while ( x < 6) {

			System.out.println("Enter number :: ");
			one = keyboard.nextDouble();
			System.out.println("Enter number :: ");
			two = keyboard.nextDouble();
			System.out.println("Enter number :: ");
			three = keyboard.nextDouble();
			System.out.println("Enter number :: ");
			four = keyboard.nextDouble();
			BiggestDouble run = new BiggestDouble(one, two, three, four);
			System.out.println(run);
		}
	}
	}