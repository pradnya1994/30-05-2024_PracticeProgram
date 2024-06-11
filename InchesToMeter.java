//Write a Java program that reads a number in inches and converts it to meters.

package practice30_05_2024;

import java.util.Scanner;

public class InchesToMeter {

	public static double Conversion(double inchesValue)
	{
		double meterValue;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the inches value: ");
		inchesValue = scanner.nextDouble();
		meterValue = inchesValue / 39.37;
		System.out.println("Meter Value is : "+meterValue);
		return meterValue;
	}
	public static void main(String[] args) {

		double inchesValue = 0;
		Conversion(inchesValue);




	}

}
