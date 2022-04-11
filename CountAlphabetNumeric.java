package javaStringconcepts;

import java.util.Scanner;

public class CountAlphabetNumeric {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the id from the user: ");
		String userid = sc.nextLine(); 
		int alphacount = 0;
		int numcount = 0; 
		int splch = 0;
		for(int i=0;i<userid.length();i++) {
			char ch = userid.charAt(i);
			if ((ch >= 'A')&& (ch <= 'Z')||(ch >= 'a')&&(ch <= 'z')) {
				alphacount++;
			}	
			else if((ch >= '0')&&(ch <= '9')) {
				numcount++;
			}
			else
			{
				splch++;
			}
		}

			System.out.println("total alphabets are:"+alphacount);
			System.out.println("total numbers are:"+ numcount);
			System.out.println("total special character are:" +splch);
	}
}
