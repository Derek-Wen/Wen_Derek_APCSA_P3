//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   WordsCompare comp = new WordsCompare();
	   comp.setWords("abe", "ape");
	   comp.compare();
	   out.print(comp.toString());
	   
	   comp.setWords("giraffe", "gorilla");
	   comp.compare();
	   out.print(comp.toString());
	   
	   comp.setWords("one", "two");
	   comp.compare();
	   out.print(comp.toString());
	   
	   comp.setWords("fun", "funny");
	   comp.compare();
	   out.print(comp.toString());
	   
	   comp.setWords("123", "19");
	   comp.compare();
	   out.print(comp.toString());
	   
	   comp.setWords("193", "1910");
	   comp.compare();
	   out.print(comp.toString());
	   
	   comp.setWords("goofy", "godfather");
	   comp.compare();
	   out.print(comp.toString());
	   
	   comp.setWords("funnel", "fun");
	   comp.compare();
	   out.print(comp.toString());
	}
}