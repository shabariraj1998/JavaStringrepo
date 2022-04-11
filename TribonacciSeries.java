package javaStringconcepts;

public class TribonacciSeries {
	public static void main(String[] args) {
		int a = 0, b=1,c=2;
		int d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("Tribo series:");
		for(int i = 3; i<=10;i++) {
			d = a+b+c;
			System.out.println(d);
			a = b;
			b = c;
			c = d;
		}
	}
}
