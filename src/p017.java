/* 
 * Solution to Project Euler problem 17
 * by Gene Horecka
 * 
 * June 22, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

public final class p17 {

	public static void main(String[] args) {
		
		long sum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			sum += toEnglish(i).length();
		}
		
		System.out.println(sum);
	}
	
	public static String toEnglish(int n) {
		
		if(n < 20) {
			return ONES[n];
		}
		else if(n < 100) {
			return TENS[n/10] + (n%10 == 0 ? "" : ONES[n % 10]);
		}
		else if(n < 1000) {
			return toEnglish(n/100) + "hundred" + (n%100 == 0 ? "" : "and" + toEnglish(n%100));

		}
		else if(n < 1000000){
			return toEnglish(n/1000) + "thousand" + (n%1000 == 0 ? "" : toEnglish(n%1000));
		}
		else {
			throw new IllegalArgumentException();
		}
		
	}
	
	public static final String ONES[] = {"zero", "one", "two", "three", "four", "five",
			"six", "seven", "eight", "nine", "ten", "eleven", "twelve",
			"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen"};
	
	public static final String TENS[] = {"", "", "twenty", "thirty", "forty", "fifty",
			"sixty", "seventy", "eighty", "ninety"};
	
	

}
