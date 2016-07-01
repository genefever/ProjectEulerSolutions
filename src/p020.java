/* 
 * Solution to Project Euler problem 1
 * by Gene Horecka
 * 
 * June 30, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

import java.math.BigInteger;

public class p020 {

	public static void main(String[] args) {

		String product = bigFac(100).toString();
		int sum = 0;
		
		for(int i = 0; i < product.length(); i++) {
			sum += product.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}
	
	public static BigInteger bigFac(int n) {
		if(n < 0)
			throw new IllegalArgumentException();
		
		BigInteger product = BigInteger.ONE;
		for(int i = 2; i <= n; i++) {
			product = product.multiply(new BigInteger(i + ""));
		}
		
		return product;
	}

}
