/* 
 * Solution to Project Euler problem 25
 * by Gene Horecka
 * 
 * June 25, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

import java.math.BigInteger;
import java.util.ArrayList;

public class p25 {

	public static void main(String[] args) {

		int n = 1;
		
		while(true) {
			if(isNumDigits(fib(n).toString(), 1000))
				break;
			n++;
		}
		
		System.out.println(n);
	}
	
	private static final ArrayList<BigInteger> DICTIONARY = new ArrayList<BigInteger>();
	
	static {
		DICTIONARY.add(BigInteger.ZERO);
		DICTIONARY.add(BigInteger.ONE);
	}
	
	public static BigInteger fib(int n) {
		
		if(n < 0) {
			throw new IllegalArgumentException();
		}
		// n already exists in the dictionary
		if(n < DICTIONARY.size()) {
			return DICTIONARY.get(n);
		}
		// otherwise calculate and add it to the dictionary
		BigInteger fibonacci = fib(n-1).add(fib(n-2));
		DICTIONARY.add(fibonacci);
		return fibonacci;
	}
	
	public static boolean isNumDigits(String s, int n) {
		if(s.length() == n)
			return true;
		
		return false;
	}

}
