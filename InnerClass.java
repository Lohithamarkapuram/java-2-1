
class Computer {
	String brand;
	String speed;
	class Processor{
		void displayDetails() {
			System.out.println("Brand: "+brand+", Speed:"+speed);
		}
	}
}
public class InnerClass{
	public static void main(String[] args) {
		Computer objComputer = new Computer();
		Computer.Processor objProcessor =objComputer.new Processor();
		objComputer.brand="HP";
		objComputer.speed="8GB";
		objProcessor.displayDetails();
	}
}