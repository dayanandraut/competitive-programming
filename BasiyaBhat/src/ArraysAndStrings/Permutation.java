package ArraysAndStrings;
/*
 * Given two strings, write a method to decide if one is a permutation of the other
 * [Solution - 1 ]: Produce all permutations of s and then check whether t is in it. O(n * n!)
 * [Solution - 1 ]: Check whether both strings have equal number of each characters. O(depends on encoding scheme)
*/
public class Permutation {
	
	// method that checks string s is permutation of t.
	// permutation of "abc" are: ["abc", "acb", "bac" "bca", "cab", "cba"]
	public boolean checkPermutation(String s, String t) {
		// if both are of unequal length, they cannot be permutation
		if(s.length()!=t.length()) return false;
		
		// Assume chars are of ASCII encoding
		int[] chars = new int[128];
		
		// scan over s and count the repetition of characters
		for(char c: s.toCharArray()) chars[c]++;
		
		// scan over t and subtract the the repetition of characters
		for(char c: t.toCharArray()) {
			chars[c]--;
			
			// if any excessive characters are in either string, the value will be either <0 or >0
			if(chars[c]!=0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Permutation permutation = new Permutation();
		System.out.println(" abc & bca :"+ permutation.checkPermutation("abc", "bca"));
		System.out.println(" abcd & bca :"+ permutation.checkPermutation("abcd", "bca"));
		System.out.println(" abe & bca :"+ permutation.checkPermutation("abc", "bce"));
	}

}
