//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;
public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		LetterRemover s = new LetterRemover();
		
		System.out.print("Sentence :: ");
		String sentences = keyboard.nextLine();
		System.out.print("letter to remove :: ");
		char character = keyboard.next().charAt(0);
		s.setRemover(sentences, character);
		s.removeLetters();
		System.out.print(s);		
											
	}
}