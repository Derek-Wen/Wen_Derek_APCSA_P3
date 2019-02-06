import java.util.Scanner;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Derek Wen
//Date - 2/6/2019
//Class - APCSA
//Lab  - Discount


public class DiscountRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();

		System.out.println("Bill After Discount :: " + Discount.getDiscountedBill(amt));

	}
}