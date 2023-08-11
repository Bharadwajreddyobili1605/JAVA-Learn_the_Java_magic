package _1GalacticArithmetic;

import java.util.Scanner;

public class ArithmeticDemo {
		public static void main(String []args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of num1:");
			long a = sc.nextLong();
			System.out.println("Enter the value of num2:");
			long b = sc.nextLong();
			sc.close();
			long res =GalacticAddition(a,b);
			System.out.println(res);
			
		}
		public static long GalacticAddition(long num1, long num2)
		{
			
			return num1+num2;
		}

	}

