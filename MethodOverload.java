
public class MethodOverload {
	public void single(String name) {
		System.out.println("Name: "+name);
	}
	public int Multi(int a, int b) {
		return a*b;
	}
	public int diff(int a, int b) {
		return a+b;
	}
	public double diff(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		MethodOverload obj = new MethodOverload();
		obj.single("Lohitha");
		System.out.println("Multiple parameters: "+obj.Multi(2, 5));
		System.out.println("Different parameters: "+obj.diff(3, 5)+","+obj.diff(2.54, 6.78));
	}
}