/* 
 * Solution to Project Euler problem 24
 * by Gene Horecka
 * 
 * June 27, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */
import java.util.ArrayList;
import java.util.List;

public class p24 {

	public static List<String> permutations = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		String numbers = "0123456789";
		final int INDEX = 1_000_000;
		
		getPermutations(numbers);
		
		System.out.println(permutations.get(INDEX-1));
	}
	
	public static void getPermutations(String num) {
		int len = num.length();
		boolean used[] = new boolean[len];
		StringBuilder perm = new StringBuilder(len);
		
		permutation(num, len, perm, used, 0);
	}
	
	public static void permutation(String num, int len, StringBuilder perm, boolean[] used, int idx) {
		if(idx == len) {
			permutations.add(perm.toString());
			return;
		}
		else {
			for(int i = 0; i < len; i++) {
				if(used[i] == true)
					continue;
				
				perm.append(num.charAt(i));
				used[i] = true;
				
				permutation(num, len, perm, used, idx + 1);
				
				used[i] = false;
				perm.deleteCharAt(perm.length() - 1);
			}
		}
	}

}
