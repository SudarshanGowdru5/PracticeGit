package overloadingandOverriding;

class Sample4{
	void status(int a, int b) {
		System.out.println("status status");
	}

	int status(int a, char ch) {
		
	
		return a;
		
	}
	static void status(double a, int b) {
		System.out.println("status videos");
	}
	
}

public class Loading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Sample4 s1=new Sample4();
  s1.status(0, 0);
  System.out.println(s1.status(0, 'A'));
  s1.status(0.5, 1);
	}
	
}
