package ArraysAndStrings;
/*
 * Implement an algorithm to determine if a string has all unique characters.
 * [Solution -1 ]: for each character, search through the string whether it is found or not . O(n^2)
 * [Solution -2 ]: Scan through the string and check any character is repeated or not. 
 */
public class UniqueNess {
	// implementation of solution - 2
	public boolean isUnique(String s) {
		// Assume the string contains ASCII chars
		// If string contains more than 128 chars, some characters will be repeated, hence string cannot be unique
		if(s.length()>128) return false; 
		
		// create an array to mark the presence of character as true
		boolean[] charset = new boolean[128];
		for(int i=0; i<s.length();i++) {
			// check whether the char is already present
			if(charset[s.charAt(i)]) return false;
			else charset[s.charAt(i)] = true;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		UniqueNess uniq = new UniqueNess();
		System.out.println("abcd:"+uniq.isUnique("abcd"));
		System.out.println("abccd:"+uniq.isUnique("abccd"));
		
	}
}

//Time complexity is max ((O(n), O(charset)))
