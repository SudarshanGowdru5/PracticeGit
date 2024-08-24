package eceptionHandling;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;
		try {
		int b=i/0;
		System.out.println(b);
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println("cathced");
		}
	}

}
