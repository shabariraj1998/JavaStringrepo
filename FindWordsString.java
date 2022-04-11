package javaStringconcepts;

public class FindWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello welcome you all"; // declare the variable in string data_type
		int count = 1;
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("total number of words: "+count);
	}

}
