//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
		//point pups at a new arry of Dog
		
	}
	
	public void set(int spot, int age, String name)
	{
		Dog var1 = new Dog(age, name);
		if (0 < spot  && spot < pups.length -1) {
			pups[spot] = var1;
		}
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int largest = 0;
		String largestname="";
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() > largest) {
				largest = pups[i].getAge();
				largestname= pups[i].getName();
			}
		}
		return null;
	}

	public String getNameOfYoungest()
	{
		int smallest = 0;
		String smallestname="";
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() < smallest) {
				smallest = pups[i].getAge();
				smallestname = pups[i].getName();
			}
		}
		return smallestname;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}