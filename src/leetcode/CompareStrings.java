package leetcode;

public class CompareStrings {
//Compare two strings A and B, determine whether A contains all of the characters in B.
//	The characters in string A and B are all Upper Case letters.
//	Example
//	For A = "ABCD", B = "ABC", return true.
//	For A = "ABCD" B = "AABC", return false.
	public boolean compareStrings(String a,String b){
		if(a.length()<b.length()) return false;
		int Alphabetnum =26;
		int[] letterCount = new int[Alphabetnum];
		for(int i = 0;i!=a.length();++i){
			++letterCount[a.charAt(i)-'A'];
		}
		 for (int i = 0; i != b.length(); ++i) {
	            --letterCount[b.charAt(i) - 'A'];
	            if (letterCount[b.charAt(i) - 'A'] < 0) {
	                return false;
	            }
	     }
		 return true;
	}
}
