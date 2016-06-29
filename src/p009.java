/* 
 * Solution to Project Euler problem 9
 * by Gene Horecka
 * 
 * June 28, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

public class p9 {

	public static void main(String[] args) {
	
		pyProduct();
	}
	
	public static void pyProduct() {
		final int LIMIT = 1000;
		
		for(int a = 1; a < LIMIT; a++) {
			for(int b = a + 1; b < LIMIT; b++) {
				int c = LIMIT - a - b;
				
				if(a*a + b*b == c*c) {
					System.out.println(a*b*c);
					return;
				}
			}
		}
	}

}
