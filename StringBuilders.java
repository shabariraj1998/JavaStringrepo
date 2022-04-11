package javaStringconcepts;

public class StringBuilders {
	public static void main(String[] args) {
		StringBuilder st1 = new StringBuilder("This is example of ");
		st1.append("java program.");
		System.out.println(st1);
		StringBuilder st2 = new StringBuilder("This is eg of");
		st2.insert(10,"java program.");
		System.out.println(st2);
		StringBuilder st3 = new StringBuilder("This is a ");
		st3.replace(0, 9, "java");
		System.out.println(st3);
		StringBuilder st4 = new StringBuilder("This is a java program");
		st4.delete(0,10);
		System.out.println(st4);
		StringBuilder st5 = new StringBuilder("This is a java program");
		st5.reverse();
		System.out.println(st5);
		StringBuilder st6 = new StringBuilder("This is a java program");
		st6.deleteCharAt(6);
		System.out.println(st6);
		StringBuilder st7 = new StringBuilder("This is a java program");
		st7.setCharAt(8, 'u');
		System.out.println(st7);
	}
}	
