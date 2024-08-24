package methods;

public class Smaple1 {

	static double areaCir() {
		int r=25;
		double pi=3.14;
		double area=pi*r*r;
		return area;
	}
static int areaRec(int a, int b) {
	int c=a*b;
	System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a=areaCir();
		int b=areaRec(12, 14);
		System.out.println(a+" "+b);
		areaRec(1, 2);
	}

}
