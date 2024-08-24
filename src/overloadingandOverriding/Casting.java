package overloadingandOverriding;

class Dem6{
	int a=15;
	void order() {
		System.out.println("cars");
		
	}
}
class Dem5 extends Dem6{
	int b=(int)1.5f;
	void order() {
		System.out.println("cars + bikes");
		
	}
}
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dem6 d1=new Dem5();
		d1.order();
		System.out.println(d1.a);
		Dem5 d2=(Dem5)d1;
		System.out.println(d2.b);
		
}
}