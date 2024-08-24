package polymorphism;

class Vehicle{
	void noise() {
		System.out.println("dur dur");
	}
}
class Car extends Vehicle{
	void noise() {
		System.out.println("gueeeee");
	}
}
class Bike extends Vehicle{
	void noise() {
		System.out.println("bur burr");
	}
}
class Lorry extends Vehicle{
	void noise() {
		System.out.println("jzuuuuuu");
	}
}
class Stimulator{
	void sound(Vehicle b1) {
		b1.noise();
	}
}

public class Vehiclesound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle a1=new Vehicle();
		Bike b1=new Bike();
		Car c1=new Car();
		Lorry l1=new Lorry();
		Stimulator s1=new Stimulator();
		s1.sound(b1);
		s1.sound(c1);
		s1.sound(l1);
	}

}
