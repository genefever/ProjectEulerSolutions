/* 
 * Solution to Project Euler problem 1
 * by Gene Horecka
 * 
 * June 27, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

public class p012 {

	public static void main(String[] args) {

		int i = 1;
		
		while(true) {
			long tSum = triangleSum(i);
			
			if(numDivs(tSum) > 500) {
				System.out.println(tSum);
				break;
			}
			
			i++;
		}
	}
	
	public static long triangleSum(int n) {
		long sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static int numDivs(long n) {
		int count = 0;
		
		for(int i = 1; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				count += 2;
			if(i == Math.sqrt(n))
				count -= 1;
		}
		
		return count;
	}

}
