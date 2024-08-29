class Animal{
	void move() {
		System.out.println("The Animal is moving");
	}
}
class Cheetah extends Animal{
	void move() {
		System.out.println("Cheetah is running");
	}
}
public class Override2 {
	public static void main(String[] args) {
		Animal obj = new Cheetah();
		obj.move();
	}
}
