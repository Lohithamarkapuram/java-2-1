
public class Rectangle1 {
	private int length, width;
	int get() {
		return length*width;
	}
	void set() {
		this.length=25;
		this.width=12;
	}
	public static void main(String[] args) {
		Rectangle1 obj = new Rectangle1();
		obj.set();
		System.out.println(obj.get());
	}
		
}
