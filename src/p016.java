/* 
 * Solution to Project Euler problem 16
 * by Gene Horecka
 * 
 * June 22, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

import java.math.BigInteger;

public final class p16 {

	public static void main(String[] args) {

		System.out.println(bigPowerSum(2, 1000));
	}
	
	public static int bigPowerSum(int b, int e) {
		
		BigInteger base = new BigInteger(b + "");
		String bigNum = base.pow(e).toString();
		
		int sum = 0;
		
		for(int i = 0; i < bigNum.length(); i++) {
			sum += bigNum.charAt(i) - '0';
		}
		
		return sum;
	}


}
