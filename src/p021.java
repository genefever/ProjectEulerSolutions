/* 
 * Solution to Project Euler problem 21
 * by Gene Horecka
 * 
 * June 27, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

public class p21 {

	public static void main(String[] args) {
		
		long sum = 0;

		for(int i = 0; i < 10000; i++) {
			int am1 = properDivSum(i);
			
			if((properDivSum(am1) == i) && (am1 != i)) {
				sum += i;
			}	
		}
		
		System.out.println(sum);
	}
	
	public static int properDivSum(int n) {
		
		int sum = 0;
		
		for(int i = 1; i <= Math.sqrt(n); i++) {
			
			if(n%i == 0) {
				sum += i;
				sum += (n/i);
			}
					
			if(i*i == n)
				sum -= i;
		}
		
		sum -= n;

		return sum;
	}

}
