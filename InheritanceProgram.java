//3) Write a Java Program to implement basic Inheritance program
class InheritanceProgram{
	public static void main(String[] args) {
		Sub obj = new Sub();
		System.out.println("Name: "+obj.a+", Class: "+obj.b);
	}
}
class Test {
	String a="Lohitha";
}
class Sub extends Test{
	String b = "CSE-C";
}
