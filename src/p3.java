/* 
 * Solution to Project Euler problem 3
 * by Gene Horecka
 * 
 * June 22, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

public class p3 {

	public static void main(String[] args) {
		
		long n = 600851475143L;

		System.out.println(largestPrimeFactor(n));
	}
	
	public static long largestPrimeFactor(long n) {
		/* Keep dividing out the smallest prime factor.
		 * The last one remaining is the largest prime factor.
		 */
		while(true) {
			long p = smallestFactor(n);
			
			if(n > p) {
				n /= p;
			}
			else {
				return n;
			}
		}
	}
	
	public static long smallestFactor(long n) {
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			// Smallest factor found
			if(n%i == 0) {
				return i;
			}
		}
		
		// Else n was already prime to begin with
		return n;
	}

}
