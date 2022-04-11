package javaStringconcepts;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String user;
		System.out.println("The username is: ");
		user = sc.nextLine();
		System.out.println("username: "+user); // Getting the name from the user
		
		for (int i=user.length()-1;i>=0;i--)
		{
			System.out.print(user.charAt(i));
		}
	}
}
