package javaStringconcepts;

public class BasicStringFunctions {
	public static void main(String[] args) {
		//Declare the String datatype
		String s = "Hello welcome";
		System.out.println("Number of characters: "+s.length()); // To find the length of the string
		System.out.println("character at 2nd position: "+s.charAt(6));// find specific char position
		System.out.println("The last character: "+s.charAt(s.length()-1));
		
		int c=0;
		for (int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if((ch == 'A')||(ch == 'E')||(ch == 'I')||(ch == 'O')||(ch == 'U')||
					(ch == 'a')||(ch == 'e')||(ch == 'i')||(ch == 'o')||(ch == 'u'))
			{
				c++;
			}
		}
			System.out.println("The total vowels is: "+c);
	}
}
