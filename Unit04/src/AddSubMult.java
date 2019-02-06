//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Derek Wen
//Date - 2/6/2019
//Class - APCSA
//Lab  - AddSubMult

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if (a > b) {
			return a - b;
		}
		else if (b > a) {
			return b - a;
		}
		return b * a;
	}
}