package ArraysAndStrings;
/*
 * Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).

O(n)
 */
public class StringCompressor {
	public String compress(String s) {
		// Use stringbuilder instead of string. String concatenates in O(kn^2), StringBuilder does in O(n)
		StringBuilder sb = new StringBuilder();
		int consecutiveCount = 0;
		for(int i=0;i<s.length();i++) {
			consecutiveCount++;
			
			// check whether you have reached to the end of string
			// check if two consecutive characters are same
			// else append the character and its count
			if(i+1>=s.length() || s.charAt(i)!=s.charAt(i+1)) {
				sb.append(s.charAt(i));
				sb.append(consecutiveCount);
				consecutiveCount = 0;
			}
		}
		return sb.toString().length()<s.length()?sb.toString():s;
	}
	
	public static void main(String[] args) {
		StringCompressor compressor = new StringCompressor();
		System.out.println("aabcccccaaa: "+compressor.compress("aabcccccaaa"));
		System.out.println("abcde: "+compressor.compress("abcde"));
	}
}
