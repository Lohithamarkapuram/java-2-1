//constructor
class Constructor{
    int age;
    Constructor(){
        age=18;
        System.out.println("Age: "+age);
    }
    Constructor(int age){
        System.out.println("Age: "+age);
    }
    public static void main(String[] args){
        Constructor ob1 = new Constructor();
        Constructor ob2 = new Constructor(20);
    }
}
