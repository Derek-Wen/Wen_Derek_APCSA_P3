//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int even = -1;
		int odd = -1;
		int distance = 0;
		for (int i = 0; i < ray.length -1; i++) {
			if (ray[i] % 2 == 1) {
				odd = i;
			}
			if (ray[i] % 2 == 0 && odd >= 0) {
				even = i;
				break;
			}
			
		}
		distance = even - odd;
		if (odd > 0 && even > 0) {
			return distance;
		}
		return -1;
	}
}