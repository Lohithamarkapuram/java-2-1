//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.'
class Person{
    String name;
    int age;
    Person(String name,int age){
        System.out.println("Name: "+name+" Age:"+age);
    }
    public static void main(String[] args){
        Person ob1 = new Person("Yasasvi",18);
        Person ob2 = new Person("Varshini",18);
    }
}
