class Animal1 {
	void eat() {
		System.out.println("Animal eats");
	}
	void sound() {
		System.out.println("Animal makes a sound");
	}
}
class Lion extends Animal1{
	void eat() {
		System.out.println("Lion eats other animals");
	}
	void sound() {
		System.out.println("Lion goes rawr");
	}
}

class Tiger extends Animal1{
	void eat() {
		System.out.println("Tiger eats other animals");
	}
	void sound() {
		System.out.println("Tiger goes rawr");
	}
}

class Panther extends Animal1{
	void eat() {
		System.out.println("Panther eats other animals");
	}
	void sound() {
		System.out.println("Panther goes rawr");
	}
}

public class Jungle {
	public static void main(String[] args) {
		Lion objLion = new Lion();
		Tiger objTiger = new Tiger();
		Panther objPanther = new Panther();
		
		objLion.eat();
		objLion.sound();
		
		objTiger.eat();
		objTiger.sound();
		
		objPanther.eat();
		objPanther.sound();
		
	}
}
