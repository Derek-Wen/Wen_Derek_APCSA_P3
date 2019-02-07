//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String first = a.substring(0,1);
	   String last = a.substring(a.length() - 1);
	   if (first == "a" || "e" || "i" || "o" || "u") {
		   return "yes";
	   }
	   if (last == "a" || "e" || "i" || "o" || "u") {
		   return "yes";
	   }
		   return "no";
	}
}