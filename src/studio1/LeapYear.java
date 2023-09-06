package studio1;

import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("input a year:");
		int year = in.nextInt();
		boolean leap = ((0 == year % 400) || ((0 == year % 4) && !(0 == year % 100)));
		System.out.println(year + " is a leap year: " + leap);
	}

}
