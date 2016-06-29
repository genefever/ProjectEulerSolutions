/* 
 * Solution to Project Euler problem 5
 * by Gene Horecka
 * 
 * June 27, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

public class p5 {

	public static void main(String[] args) {
		
		System.out.println(evenlyDivisible(20));
	}
	
	public static long evenlyDivisible(int n) {
		long d = 1;
		
		while(true) {
			for(int i = 1; i <= n; i++) {
				if(d%i != 0)
					break;
				
				if(i == n)
					return d;
			}
			
			d++;
		}
	}

}
