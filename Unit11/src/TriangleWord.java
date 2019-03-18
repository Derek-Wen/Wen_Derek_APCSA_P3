//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Derek Wen

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		for (int i = 1; i <= word.length(); i++) {
			for (int a = i; a > 0; a--) {
				System.out.print(word.substring(0, i));
			}
			System.out.println();
		}
	}
}