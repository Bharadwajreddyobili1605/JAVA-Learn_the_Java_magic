package _3TheDoubleTrouble;

import java.util.Scanner;

public class Doubling {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num =scan.nextInt();
		scan.close();
		System.out.println(doubleTheNumber(num));
		
	}
	public static int doubleTheNumber(int num)
	{
		return 2*num;
	}
	
}
