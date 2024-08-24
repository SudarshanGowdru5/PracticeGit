package stringFunctions;

public class Alllinone1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="helloword";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.charAt(4));
		char[] s2=s1.toCharArray();
		for(int i=0;i<s2.length;i++) {
			System.out.print(s2[i]);
		}
		System.out.println(s1.contains("word"));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4,6));
	
		
		
		
	}

}
