package javaStringconcepts;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String s = sc.nextLine();
		String res="";
		System.out.println(s.length());
		for (int i=s.length()-1;i>=0;i--) {
			res = res+s.charAt(i);
		}
		if(res.equalsIgnoreCase(s.toUpperCase())) {
			System.out.println("it is palindrome: " +res);
		}
		else {
			System.out.println("it is not palindrome");
		}
	}

}
