/* 
 * Solution to Project Euler problem 10
 * by Gene Horecka
 * 
 * June 22, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

public class p10 {

	public static void main(String[] args) {

		long sum = 0;
		int primes[] = sieve(2_000_000);
		
		for(int i = 0; i < primes.length; i++) {
			if(primes[i] == 1)
				sum += i;
		}
		
		System.out.println(sum);
	}
	
	public static int[] sieve(int n) {
		
		int primes[] = new int[n+1];
		
		for(int i = 2; i <= n; i++) {
			primes[i] = 1;
		}
		
		primes[0] = 0;
		primes[1] = 0;
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(primes[i] == 1) {
				for(int j = 2; i*j <= n; j++) {
					
					primes[i*j] = 0;
				}
			}
		}
		
		return primes;
	}

}
