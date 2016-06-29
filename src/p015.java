/* 
 * Solution to Project Euler problem 15
 * by Gene Horecka
 * 
 * June 22, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

public final class p15 {

	public static void main(String[] args) {
		
		System.out.println(latticePaths(20));
	}
	
	public static long latticePaths(int gridSize) {
		
		long numPaths = 1;
		
		// Find number of paths using combinatorics
		for (int i = 0; i < gridSize; i++) {
			numPaths *= (gridSize*2 - i);
			numPaths /= (i + 1);	
		}
		
		return numPaths;
	}

}
