package leetcode;

import java.util.Collections;

public class twoStringsAreAnagrams {
	public boolean anagram(String s,String t){
		if(s.isEmpty()||t.isEmpty()){
			return false;
		}
		if(s.length()!=t.length()){
			return false;
		}
		int [] letterCount={0};
		for(int i =0; i!=s.length();++i){
			++letterCount[s.charAt(i)];
			--letterCount[t.charAt(i)];
		}
		for(int i =0;i!=t.length();++i){
			if(letterCount[t.charAt(i)]!=0){
				return false;
			}
		}
		return true;
	}
}
