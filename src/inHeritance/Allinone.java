package inHeritance;

public class Allinone {

	public static void main(String[] args) {
		Sample2 s1=new Sample2();
		s1.aa();
		Demo1 s2=new Demo1();
		s2.aa();
	}

}
class Sample1{
	 void aa() {
		System.out.println("hello");
	}
}
class Sample2 extends Sample1{
	int i=1;
}
class Demo1 extends Sample2{
	static void aaa() {
		System.out.println("hi");
	}
}
class Demo2 extends Sample2{
	static void aaa() {
		System.out.println("hi");
	}
}