import java.math.BigInteger;

/* 
 * Solution to Project Euler problem 6
 * by Gene Horecka
 * 
 * June 27, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

public class p6 {

	public static void main(String[] args) {
		BigInteger squareSum = squareSum(100);
		BigInteger sumSquared = sumSquared(100);
		
		System.out.println(sumSquared(100).subtract(squareSum(100)));
	}
	
	public static BigInteger squareSum(int n) {
		
		BigInteger sum = BigInteger.ZERO;
		
		for(int i = 1; i <= n; i++) {
			BigInteger b = new BigInteger(Integer.toString(i));
			b = b.multiply(b);
			
			sum = sum.add(b);
		}
		
		return sum;
	}
	
	public static BigInteger sumSquared(int n) {
		
		BigInteger sum = BigInteger.ZERO;
		
		for(int i = 1; i <= n; i++) {
			sum = sum.add(new BigInteger(Integer.toString(i)));
		}
		
		return sum.multiply(sum);
	}
}
