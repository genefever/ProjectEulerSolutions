/* 
 * Solution to Project Euler problem 23
 * by Gene Horecka
 * 
 * June 27, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

public class p23 {

	public static void main(String[] args) {
		final int MAX = 28124;
		boolean abSum[] = new boolean[MAX];
		int sum = 0, divSum = 0;

		/* Go through every number and find out which
		 * numbers are abundant sums.
		 */
		for(int i = 1; i < abSum.length; i++) {
			divSum = 0;
			sum += i;
			
			for(int d = 1; d < i; d++) {
				if(i%d == 0)
					divSum += d;
			}
			
			if(divSum > i)
				abSum[i] = true;
		}
		
		/* Iterate through the list and find if 
		 * number is a sum of 2 abundant sums.
		 * If so, subtract from total sum.
		 * We only want sums of nonabundant sums.
		 */
		for(int i = 1; i < abSum.length; i++) {
			for(int d = 1; d < i; d++) {
				if(abSum[d] && abSum[i-d]) {
					sum -= i;
					break;
				}
			}
		}
		
		System.out.println(sum);
	}

}
