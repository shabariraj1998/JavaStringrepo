package javaStringconcepts;

import java.util.Scanner;

public class Uservalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String existuser = "Shabarirajnlsr";
		String Userpassword = "shabarinlsr@12";
		int attempt = 0;
		Scanner sc = new Scanner(System.in);
		do {
		String username,pswd;
		System.out.println("The username is: ");
		username = sc.nextLine();
		System.out.println("username: "+username);
		System.out.println("password is: ");
		pswd = sc.nextLine();
		if ((existuser.equals(username))&&Userpassword.equals(pswd)) {
			System.out.println(username +" Login successfully");
			break;
		}
		else
		{
			System.out.println(username + " and " +pswd+ "is incorrect");
		}
		attempt++;
		System.out.println("you have an " +attempt+ " more attempt");
		}while(attempt<3);
		System.out.println("please try to login after 24hrs");
		
	}

}
