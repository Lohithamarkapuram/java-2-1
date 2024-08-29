
public class Cat {
	int age;
	String name;
	Cat(){
		name="Unknown";
		age=0;
	}
	public static void main(String[] args) {
		Cat obj = new Cat();
		System.out.println("Name: "+obj.name+", Age: "+obj.age);
	}
}
