/* 
 * Solution to Project Euler problem 18
 * by Gene Horecka
 * 
 * June 22, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

import java.io.*;

public final class p18 {
	
	public static void main(String[] args) throws IOException {
		File input = new File("text/p18.txt");
		
		try {
			FileReader reader1 = new FileReader(input);
			FileReader reader2 = new FileReader(input);
			BufferedReader buff1 = new BufferedReader(reader1);
			BufferedReader buff2 = new BufferedReader(reader2);
			
			int lines = 0;
			
			while(buff1.readLine() != null) {
				lines++;
			}
			
			int table[][] = new int[lines][lines];
			String stringLine[] = new String[lines];
			String s;
		
			int j = 0;
			
			// Fill up the table
			while((s = buff2.readLine()) != null) {
				stringLine = s.split(" ");
						
				for(int i = 0; i < stringLine.length; i++) {
					table[j][i] = Integer.parseInt(stringLine[i]);
				}
				
				j++;
			}
			
			// Calculate max sum path
			for(int row = lines-2; row >= 0; row--) {
				for(int col = 0; col < row+1; col++) {
					
					table[row][col] = Math.max(table[row][col] + table[row+1][col], 
												table[row][col] + table[row+1][col+1]);
				}
			}
			
			System.out.println(table[0][0]);
			reader1.close();
			reader2.close();
			
		} catch(FileNotFoundException e) {
			
			System.err.println("Error reading from file.");
		}
	}
	
}