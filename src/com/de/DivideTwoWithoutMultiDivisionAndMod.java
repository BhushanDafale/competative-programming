package com.de;

public class DivideTwoWithoutMultiDivisionAndMod {

	public static void main(String[] args) {
		double result = divide(10, -2);
		System.out.println(result);
	}
	
	private static double divide(int dividend, int divisor) {
		int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
		
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		
		int quotient = 0;
		
		while(dividend >= divisor) {
			dividend -= divisor;
			++quotient;
		}
		
		return sign * quotient;
	}

}
