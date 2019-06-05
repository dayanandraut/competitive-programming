package ArraysAndStrings;
/*
 * Given a string, write a function to check if it is a permutation of a palindrome.
A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.

Ignore non-letters. Assume lowercase or uppercase

[Hint]: A string can have palindrome permutation if it has at most one character of odd repetition.
 */
public class PalindromePermutation {
	public boolean hasPalindromePermutation(String s) {
		// Assume characters from 'a' to 'z' only
		char[] chars = new char['z'-'a'+1];
		int oddCount = 0;
		
		//count the repetition of each character
		for(int i=0;i<s.length();i++) {
			//ignore spaces
			if(s.charAt(i)==' ') continue;
			chars[s.charAt(i)-'a']++;
		}
		
		// check for the number of odd-characters		
		for(int i=0;i<chars.length;i++) {
			if(chars[i]%2==1) oddCount++;
			// if no. of odd-characters exceeds 1, palindrome is not possible
			if(oddCount>1)return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		PalindromePermutation palindromePermutation = new PalindromePermutation();
		System.out.println("tact coa: "+palindromePermutation.hasPalindromePermutation("tact coa"));
		System.out.println("abcca: "+palindromePermutation.hasPalindromePermutation("abcca"));
		System.out.println("abccac: "+palindromePermutation.hasPalindromePermutation("abccac"));
		
	}
}
