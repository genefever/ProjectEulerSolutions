/* 
 * Solution to Project Euler problem 16
 * by Gene Horecka
 * 
 * June 22, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

public final class p14 {

	public static void main(String[] args) {
;
		int i = 0;
		int longestChainNum = 0;
		long curr = 0;
		long max = 0;
		
		while(i < 1_000_000) {
			curr = collatzChain(i);
			
			if(max < curr) {
				longestChainNum = i;
				max = curr;
			}
			
			i++;
		}
		
		System.out.println(longestChainNum);
	}
	
	public static long collatzChain(int n) {
		
		long count = 0;

		while(n > 1) {	
			n = (n%2 == 0) ? (n / 2) : (3*n + 1);
			count++;
		}

		return count;
	}
}
