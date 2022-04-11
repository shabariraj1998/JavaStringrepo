package javaStringconcepts;

public class Initialword {

	public static void main(String[] args) {
		String s = "Mohandas Karamchand Gandhi";
		String initial = " ";
		System.out.println("using string convert to initial:");
		for(int i=0; i<s.length();i++) {
			if(i == 0) {
				initial = s.charAt(i)+".";
			}
			else if(s.charAt(i)==' ') {
				initial = initial+s.charAt(i+1)+".";
				
			}
		}
		System.out.println("name has shorted:"+initial);
		
	}
}
