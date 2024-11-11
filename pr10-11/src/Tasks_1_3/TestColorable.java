package Tasks_1_3;

public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = {
                new Circle(6.0),
                new Rectangle(5.0, 8.0),
                new Square(3.5),
                new ComparableRectangle(6.0, 7.0),
                new Square(8.0)
        };

        for (GeometricObject obj : objects) {
            System.out.println(obj);
            System.out.println("Площадь: " + obj.getArea());

            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
            System.out.println();
        }
    }
}
