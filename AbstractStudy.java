package abstraction;
abstract class Car{
	int maxspeed;
	abstract void accelerate();
	
	abstract void brake();
	
}
abstract class BMW extends Car{
	void accelerate() {
		System.out.println("BMW is accelerating");
	}
}

class BMW2 extends BMW{
	void brake() {
	    System.out.println("BMW is applying brake");
	}
}
public class AbstractStudy {
	public static void main(String [] args) {
		BMW2 b = new BMW2();
		b.accelerate();
		
		BMW2 b1 = new BMW2();
		b1.brake();
	}

}
