//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality equal = new StringEquality();
		equal.setWords("hello","goodbye");
		equal.checkEquality();
		out.print(equal.toString());
		
		equal.setWords("one","two");
		equal.checkEquality();
		out.print(equal.toString());
		
		equal.setWords("three","four");
		equal.checkEquality();
		out.print(equal.toString());
		
		equal.setWords("TCEA","UIL");
		equal.checkEquality();
		out.print(equal.toString());
		
		equal.setWords("State","Champions");
		equal.checkEquality();
		out.print(equal.toString());
		
		equal.setWords("ABC","ABC");
		equal.checkEquality();
		out.print(equal.toString());
		
		equal.setWords("ABC","CBA");
		equal.checkEquality();
		out.print(equal.toString());
		
		equal.setWords("Same","Same");
		equal.checkEquality();
		out.print(equal.toString());
	}
}