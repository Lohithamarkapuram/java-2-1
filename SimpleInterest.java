

public class SimpleInterest {
	public static int si(int p, int t, int r) {
		return (p*t*r)/100;
	}
	public static void main(String[] args) {
		System.out.println("Simple Interest is: "+si(30000, 4, 2));
	}
}
