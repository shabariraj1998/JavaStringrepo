package javaStringconcepts;

public class Basicprog {
	public static void main(String[] args) {
		int i = 0, i1= 1;
		int i2 = 0;
		System.out.println(i);
		System.out.println(i1);
		for (int j=2;j<=10;j++) {
			//System.out.println(i2);
			i2 = i1+i;//1, 
			System.out.println(i2);//1
			i=i1;//1
			i1=i2;//1
		}
}
}
