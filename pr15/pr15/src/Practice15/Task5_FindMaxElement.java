package Practice15;

public class Task5_FindMaxElement {
    public static <E extends Comparable<E>> E findMax(E[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        E max = array[0];
        for (E element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Task5_Circle[] circles = {
                new Task5_Circle(1.5),
                new Task5_Circle(2.3),
                new Task5_Circle(0.9),
                new Task5_Circle(3.7)
        };

        Task5_Circle maxCircle = findMax(circles);
        System.out.println("Circle with the largest radius: " + maxCircle);
    }
}
