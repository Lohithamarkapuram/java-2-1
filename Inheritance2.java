import java.util.Scanner;

class Person{
	String first_name;
	String last_name;
	public void getFirstname() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First name: ");
		first_name=input.nextLine();
		input.close();
		System.out.println(first_name);
	}
	
	public void getLastname() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Last name: ");
		last_name=input.nextLine();
		input.close();
		System.out.println(last_name);
	}
}
class Employee extends Person{
	String title;
	public void getEmployeeId() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Employee title: ");
		title=input.nextLine();
		input.close();
		System.out.println(title);
	}
}
public class Inheritance2 {
	public static void main(String[] args) {
		Person objPerson = new Person();
		Employee obj = new Employee();
		objPerson.getFirstname();
		obj.getEmployeeId();
	}
}
