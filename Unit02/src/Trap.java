//© A+ Computer Science  -  www.apluscompsci.com
//Name - Derek Wen
//Date - 2/1/2019
//Class - APCSA
//Lab  - Unit 2, Trap,

public class Trap
{
	public static double area( int base1, int base2, int height )
	{
		double trape = 0;
		double total = base1 + base2;
		double total2 = (double) 0.5 * total;
		trape = total2 * height;
		return trape;
	}
}