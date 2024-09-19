//Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.
class Rectangle{
    int width,height;
    int area(int width, int height){
        return width*height;
    }
    public static void main(String[] args){
        Rectangle obj = new Rectangle();
        System.out.println("Area of a rectangle is "+obj.area(23,45));
    }
}
