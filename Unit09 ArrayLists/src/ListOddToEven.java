//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Derek Wen
//Date - 3/8/2019

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		for (int i = 0; i < ray.size(); i++)
		{
			if (ray.get(i) % 2 > 0)
			{
				for (int a = ray.size() - 1; a > ray.indexOf(i); a--)
				{
					if (ray.get(a) % 2 == 0)
					{
						return (ray.lastIndexOf(ray.get(a)) - ray.indexOf(ray.get(i)));
					}
				}
			}
			
		}
		return -1;
	}
}