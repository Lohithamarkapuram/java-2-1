import java.util.Scanner;

class Shape {
	int getArea() {
		int n1=23;
		int n2=24;
		return n1*n2;
	}
}
class Rectangle extends Shape{
	int getArea() {
		int l;
		int b;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle:");
		l=input.nextInt();
		b=input.nextInt();
		input.close();
		return l*b;
	}
}


public class Overriding{
	public static void main(String[] args) {
		Rectangle  obj = new Rectangle();
		System.out.println("Area of Rectangle is "+obj.getArea());
	}
}