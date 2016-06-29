/* 
 * Solution to Project Euler problem 1
 * by Gene Horecka
 * 
 * June 27, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

public class p2 {

	public static void main(String[] args) {
		int fib1 = 1, fib2 = 2;
		int sum = 0;
		
		while(fib2 < 4_000_000) {
			if(fib2 % 2 == 0)
				sum += fib2;
			
			int tmp = fib1 + fib2;
			fib1 = fib2;
			fib2 = tmp;
		}
		
		System.out.println(sum);
	}

}
