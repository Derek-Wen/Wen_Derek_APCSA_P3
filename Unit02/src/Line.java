//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		int slope = 0;
		int top = y2 - y1;
		int bottom = x2 - x1;
		slope = top / bottom;
		return slope;
	}

}