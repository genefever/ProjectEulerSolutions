/* 
 * Solution to Project Euler problem 1
 * by Gene Horecka
 * 
 * June 27, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

public class p1 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(i < 1_000) {
			if((i%3 == 0) || (i%5) == 0)
				sum += i;
			i++;
		}
		
		System.out.println(sum);

	}

}
