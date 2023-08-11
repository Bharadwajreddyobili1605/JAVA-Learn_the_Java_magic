package _4TheStringJoiner;

import java.util.Scanner;

public class StringJoiner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name & last name");
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		scan.close();
		System.out.println(joinStrings(str1,str2));
		

	}
	public static String joinStrings(String str1, String str2) {
		return str1+str2;
		
	}
	

}
