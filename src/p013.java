/* 
 * Solution to Project Euler problem 1
 * by Gene Horecka
 * 
 * June 30, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class p013 {

	public static void main(String[] args) throws IOException {
		try {
		File file = new File("text/p13.txt");
		FileReader reader = new FileReader(file);
		BufferedReader buff = new BufferedReader(reader);
		
		String s = "";
		String numArr[] = new String[100];
		int i = 0;
		
		// Fill up the number array
		while((s = buff.readLine()) != null) {
			numArr[i] = s;
			i++;
		}
		
		String result = addBig(numArr).toString().substring(0, 10);
		
		System.out.println(result);
		
		reader.close();
		
		} catch (FileNotFoundException e) {
			System.err.println("Error reading from file.");
		}
		
	}
	
	public static BigInteger addBig(String[] numArr) {
		BigInteger sum = BigInteger.ZERO;
		
		for(int i = 0; i < numArr.length; i++) {
			BigInteger num = new BigInteger(numArr[i]);
			sum = sum.add(num);
		}
		
		return sum;
	}

}
