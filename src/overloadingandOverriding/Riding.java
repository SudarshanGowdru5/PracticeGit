package overloadingandOverriding;

class Demo3{
	void order() {
		System.out.println("cars");
	}
}
class Demo4 extends Demo3{
	void order() {
		System.out.println("cars + bikes");
		super.order();
		
		int d=(int)1.5f;
	}
}
public class Riding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo4 d1=new Demo4();
		d1.order();
	}

}
