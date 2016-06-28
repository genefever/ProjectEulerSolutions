/* 
 * Solution to Project Euler problem 22
 * by Gene Horecka
 * 
 * June 23, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public final class p22 {

	public static void main(String[] args) throws IOException {
		try {
			File file = new File("text/p022_names.txt");
			
			FileReader reader = new FileReader(file);
			BufferedReader buff = new BufferedReader(reader);
			
			String names[] = null;
			String s;
			
			while((s = buff.readLine()) != null) {
				names = s.split(",");
			}
			
			Arrays.sort(names);
			
			int totalScore = 0;
			
			// Iterate through name list
			for(int i = 0; i < names.length; i++) {
				//Iterate through each name
				int positionSum = 0;
				
				//Escape the double quote at beginning and end
				for(int j = 1; j < names[i].length() - 1; j++) {
					positionSum += names[i].charAt(j) - '@';
				}
				
				totalScore += positionSum * (i+1);	
			}
			
			System.out.println(totalScore);
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Error loading file.");
		}
	}
}