
import java.util.Scanner;

public class InputFromUser {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter student name: ");
		String s = Input.nextLine();
		System.out.println("Enter roll number: ");
		String a = Input.nextLine();
		System.out.println("The name of the student is: "+s+" and the roll number is: "+a);
	}
}
