public class AreaCalculator {

    public static double area(double side) {
        return side * side;
    }

    public static double area(double length, double width) {
        return length * width;
    }

    public static double area(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double squareSide = 5;
        System.out.println("Area of square: " + area(squareSide));

        double rectangleLength = 10;
        double rectangleWidth = 5;
        System.out.println("Area of rectangle: " + area(rectangleLength, rectangleWidth));

        double circleRadius = 7;
        System.out.println("Area of circle: " + area(circleRadius, true));
    }
}
