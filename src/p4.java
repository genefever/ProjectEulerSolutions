/* 
 * Solution to Project Euler problem 4
 * by Gene Horecka
 * 
 * June 27, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

public class p4 {

	public static void main(String[] args) {
		
		int max = 0;
		
		for(int i = 999; i > 0; i--) {
			for(int j = 999; j > 0; j--) {
				int product = i * j;
				
				if(isPalindrome(Integer.toString(product))) {
					max = Math.max(product, max);
				}
			}
		}
		
		System.out.println(max);
	}
	
	public static boolean isPalindrome(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != str.charAt(str.length() - i - 1))
				return false;
		}
		
		return true;
	}

}
