package Tasks_4_6;

public class TestSumArea {
    public static void main(String[] args) {

        GeometricObject[] objects = {
                new Circle(2.0),
                new Circle(8.0),
                new Rectangle(1.5, 4.0),
                new Rectangle(4.0, 7.5)
        };

        double totalArea = sumArea(objects);

        System.out.println("Общая площадь всех объектов: " + totalArea);
    }

    public static double sumArea(GeometricObject[] a) {
        double totalArea = 0;
        for (GeometricObject obj : a) {
            totalArea += obj.getArea();
        }
        return totalArea;
    }
}
