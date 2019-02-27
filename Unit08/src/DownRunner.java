//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Derek Wen
//Date - 2/25/2019

public class DownRunner
{
	public static void main( String args[] )
	{
		RayDown s = new RayDown();
		int array[] = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		System.out.println(s.go(array));
		int array2[] = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(s.go(array2));
		
	}
}