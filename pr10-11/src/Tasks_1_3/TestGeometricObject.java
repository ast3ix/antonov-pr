package Tasks_1_3;

public class TestGeometricObject {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(7.0);

        GeometricObject largestCircle = GeometricObject.max(circle1, circle2);
        System.out.println("Наибольший круг: " + largestCircle);

        Rectangle rectangle1 = new Rectangle(8.0, 3.5);
        Rectangle rectangle2 = new Rectangle(7.0, 5.0);

        GeometricObject largestRectangle = GeometricObject.max(rectangle1, rectangle2);
        System.out.println("Наибольший прямоугольник: " + largestRectangle);
    }
}
