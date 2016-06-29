/* 
 * Solution to Project Euler problem 7
 * by Gene Horecka
 * 
 * June 27, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

public class p7 {

	public static void main(String[] args) {
		
		long count = 0;
		long i = 2;
		
		while(true) {
			if(isPrime(i)) {
				count++;
				
				if(count == 10_001)
					break;
			}
			
			i++;
		}
		
		System.out.println(i);
	}
	
	public static boolean isPrime(long n) {
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		
		return true;
	}

}
