//4) Write a Java Program to implement overriding of method in class 
class Main{
	public void display() {
		System.out.println("Parent");
	}
}
class Dub extends Main{
	public void display() {
		System.out.println("Child");
	}
}
class MethodOverriding {
	public static void main(String[] args) {
		Dub obj = new Dub();
		obj.display();
	}
}
