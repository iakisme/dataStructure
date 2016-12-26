package leetcode;

public class LongestCommonSubstring {
	public int longestCommonSubstring(String a,String b){
		if(a.length()==0||b.length()==0){
			return 0;
		}
		int lcs=0;
		int lcs_temp=0;
		for(int i =0;i<a.length();++i){
			for(int j =0;j<b.length();++j){
				lcs_temp=0;
				while((i + lcs_temp < a.length()) &&(j + lcs_temp < b.length()) &&
	                       (a.charAt(i + lcs_temp) == b.charAt(j + lcs_temp))){
					++lcs_temp;
				}
				if(lcs_temp>lcs){
					lcs = lcs_temp;
				}
			}
		}
		return lcs;
	}
}
