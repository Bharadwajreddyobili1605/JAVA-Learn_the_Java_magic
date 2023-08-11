package _5TheJourneyCalculator;

import java.util.Scanner;

public class JourneyCalculatorApp {
public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Speed & Time:");
	double speed=scan.nextDouble();
	double time=scan.nextDouble();
	scan.close();
	JourneyCalculator journeycalculator=new JourneyCalculator();
	double distance = journeycalculator.calculateDistance(speed, time);
	System.out.println(distance);
}
}
