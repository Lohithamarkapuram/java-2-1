package src;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Rectangle ob1 = new Rectangle();
		Triangle ob2 = new Triangle();
		Circle ob3 = new Circle();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter dimensions of Rectangle: ");
		int c = input.nextInt();
		int d = input.nextInt();
		ob1.printArea(c,d);
		System.out.println("Enter dimensions of Triangle: ");
		int c1 = input.nextInt();
		int d1 = input.nextInt();
		ob2.printArea(c1,d1);
		System.out.println("Enter Radius of circle: ");
		int c2 = input.nextInt();
		input.close();
		ob3.printArea(c2,c2);
	}
}
interface Shape{
	public int a = 0;
	public int b = 0;
	void printArea(int a, int b);
}

class Rectangle implements Shape{
	public void printArea(int a, int b) {
		System.out.println("The Area of Rectangle is "+a*b);
	}
}

class Triangle implements Shape{
	public void printArea(int a, int b) {
		System.out.println("The Area of Triangle is "+a*b*0.5);
	}
}

class Circle implements Shape{
	public void printArea(int a,int b) {
		System.out.println("The Area of Circle is "+a*a*3.14);
		
	}
}
