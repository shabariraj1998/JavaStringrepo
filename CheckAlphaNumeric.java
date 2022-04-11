package javaStringconcepts;

public class CheckAlphaNumeric {
	public static void main(String[] args) {
			String s = "sdda";
			boolean Flag = false;
		for ( int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch >= '0'&& ch <='9') {
				Flag = true;
			}
		}
		if(Flag == true) {
			System.out.println("strings are numeric");
		}
		else {
			System.out.println("strings are non numeric");
		}
	}
}
