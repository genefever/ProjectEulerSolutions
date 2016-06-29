/* 
 * Solution to Project Euler problem 11
 * by Gene Horecka
 * 
 * June 28, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class p11 {

	public static void main(String[] args) throws IOException {
		
		try {
			File file = new File("text/p11.txt");
			FileReader reader = new FileReader(file);
			BufferedReader buff = new BufferedReader(reader);
	
			int grid[][] = new int[20][20];
			String row = "";
			int i = 0;
			
			// Fill up the grid from the data in input file
			while((row = buff.readLine()) != null) {
				String strArr[] = row.split(" ");
				
				for(int j = 0; j < strArr.length; j++) {
					grid[i][j] = Integer.parseInt(strArr[j]);
				}
				
				i++;
			}
			
			// Compute the largest product
			System.out.println(largestProduct(grid, 4));
			
			reader.close();
			
		} catch(FileNotFoundException e) {
			
		}
	}
	
	public static long largestProduct(int[][] arr, int adj) {
		long max = -1;
		
		for(int i = 0; i <= arr.length - adj; i++) {
			for(int j = 0; j <= arr.length - adj; j++) {
				long row = arr[i][j] * arr[i+1][j] * arr[i+2][j] * arr[i+3][j];
				long col = arr[i][j] * arr[i][j+1] * arr[i][j+2] * arr[i][j+3];
				long rdiag = arr[i][j] * arr[i+1][j+1] * arr[i+2][j+2] * arr[i+3][j+3];
				long ldiag = arr[i+3][j] * arr[i+2][j+1] * arr[i+1][j+2] * arr[i][j+3];
				
				long tmp = Math.max(row, col);
				tmp = Math.max(tmp, rdiag);
				tmp = Math.max(tmp, ldiag);
				
				max = Math.max(max, tmp);
			}
		}
		
		return max;
	}
	

}
