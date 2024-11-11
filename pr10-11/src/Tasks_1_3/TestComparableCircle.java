package Tasks_1_3;

public class TestComparableCircle {
    public static void main(String[] args) {

        ComparableCircle comparableCircle1 = new ComparableCircle(3.0);
        ComparableCircle comparableCircle2 = new ComparableCircle(4.2);

        GeometricObject largestComparableCircle = GeometricObject.max(comparableCircle1, comparableCircle2);
        System.out.println("Наибольший из двух кругов tasks_1_to_3.ComparableCircle: " + largestComparableCircle);

        ComparableCircle circle = new ComparableCircle(8.0);
        Rectangle rectangle = new Rectangle(5.0, 7.0);

        GeometricObject largestShape = GeometricObject.max(circle, rectangle);
        System.out.println("Наибольший объект между кругом и прямоугольником: " + largestShape);
    }
}
