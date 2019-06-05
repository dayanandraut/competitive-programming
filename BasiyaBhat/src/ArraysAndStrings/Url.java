package ArraysAndStrings;
/*
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)

Input: "Mr John Smith ", 13
Output: "Mr%20John%20Smith"

[Solution]: scan from the end(true length) of char array and shift the characters towards the end(total length) of char array
 */
public class Url {
		public String urlify(char[] s, int trueLength) {
			int k = s.length - trueLength; // is the gap between total length and true length
			
			for(int i=trueLength-1;i>=0;i--) {
				// if there is no gap, ie, k==0, there is no need to shift
				if(k==0) break;
				if(s[i]==' ') {
					s[i+k] = '0';
					s[i+k-1] = '2';
					s[i+k-2] = '%';
					// for every replacement, the gap decreases by 2 
					k -= 2;
				}
				else s[i+k] = s[i];
			}
			return new String(s);
		}
		
		public static void main(String[] args) {
			Url url = new Url();
			System.out.println(url.urlify("Mr John Smith    ".toCharArray(), 13));
		}
}
