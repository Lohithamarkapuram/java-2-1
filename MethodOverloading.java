/*1) Write a Java Program to implement Method Overloading 
			- Single Parameters
			- Multiple Parameters
			- Different Datatypes */
public class MethodOverloading{

    public void display(int number) {
        System.out.println("Single parameter method called with an integer: " + number);
    }

    public void display(String text) {
        System.out.println("Single parameter method called with a string: " + text);
    }

    public void display(int number, String text) {
        System.out.println("Multiple parameters method called with an integer: " + number + " and a string: " + text);
    }

    public void display(double decimal, boolean flag) {
        System.out.println("Multiple parameters method called with a double: " + decimal + " and a boolean: " + flag);
    }

    public static void main(String[] args) {
        MethodOverloading example = new MethodOverloading();
        example.display(10);
        example.display("Lohitha");
        example.display(20, "Overloaded Method");
        example.display(15.5,true);
}
}
