//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Derek
//Date - 2/4/2019
//Class - APCSA
//Lab  - Distance Runner

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter X1:");
		int xOne = keyboard.nextInt();
		System.out.println("Enter Y1:");
		int yOne = keyboard.nextInt();
		System.out.println("Enter X2:");
		int xTwo = keyboard.nextInt();
		System.out.println("Enter Y2:");
		int yTwo = keyboard.nextInt(); 
		
		Distance test = new Distance();
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		test.calcDistance();
		test.print();
	}
}