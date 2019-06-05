package ArraysAndStrings;
/*
 * Implement an algorithm to determine if a string has all unique characters.
 */
public class UniqueNess {
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
}
