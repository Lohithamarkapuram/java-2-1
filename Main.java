//innerclass
class Main{
    public static void main(String[] args){
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        System.out.println("X is "+out.x+"\nY is "+in.y);
    }
}
class Outer{
    int x=10;
    class Inner{
        int y=30;
    }
}
