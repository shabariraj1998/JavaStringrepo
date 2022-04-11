package javaStringconcepts;

public class OnlyAlphabets {

	public static void main(String[] args) {
		String name = "nlsr";
		boolean flag = false;
		for (int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if((ch >= 'A' && ch<= 'Z')||(ch >= 'a')&&(ch <= 'z')) {
				flag = true;
			}
		}
		if(flag == true) {
			System.out.println("strings are only-Alphabets");
		}
		else {
			System.out.println("strings are alphabets and numeric");
		}

	}

}
