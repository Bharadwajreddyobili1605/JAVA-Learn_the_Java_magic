package _2ArithmeticOperations;

import java.util.Scanner;

public class Operations {
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("num1:");;
			int a =scan.nextInt();
			System.out.println("num2:");
			int b = scan.nextInt();
			scan.close();
			int sub =substraction(a,b);
			System.out.println("Substraction result will be:"+sub);
			int mul = multiplication(a,b);
			System.out.println("Multiplication result will be:"+mul);
			double div=  division(a,b);
			System.out.println("Division result will be:"+div);
			int mod = modulus(a,b);
			System.out.println("Modulus result will be:"+mod);
			
		}
		public static int substraction(int num1,int num2)
		{
			return num2-num1;
		}
		public static int multiplication(int num1,int num2)
		{
			return num1*num2;
		}
		public static double division(int num1,int num2)
		{
			return num1/num2;
		}
		public static int modulus(int num1,int num2)
		{
			return num1%num2;
		}

	}


