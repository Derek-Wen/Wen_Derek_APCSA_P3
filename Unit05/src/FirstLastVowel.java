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
	   if (first = a.startsWith("a") || a.startsWith("e") || a.startsWith("i") || a.startsWith("o") || a.startsWith("u")) {
		   return "yes";
	   }
	   else if (last = a.startsWith("a") || a.startsWith("e") || a.startsWith("i") || a.startsWith"(o") || a.startsWith("u")) {
		   return "yes";
	   }
		   return "no";
	}
}