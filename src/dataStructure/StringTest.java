package dataStructure;

public class StringTest {
	
	public void test(){
		String s1 = new String();
		String s2 = "billyan";
		int s2len = s2.length();
		s2.substring(4,8);// return "ryan"
		StringBuilder s3 = new StringBuilder(s2.substring(4,8));
		s3.append("bill");
		String s2New = s3.toString(); // return "ryanbill"
		char[] s2Char = s2.toCharArray();
		char ch = s2.charAt(4);// return 'r'
		int index = s2.indexOf('r');// return 4. if not found, return -1
		
	}
}
