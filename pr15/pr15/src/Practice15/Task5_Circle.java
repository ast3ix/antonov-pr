package Practice15;

public class Task5_Circle implements Comparable<Task5_Circle> {
    private double radius;

    public Task5_Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int compareTo(Task5_Circle other) {
        return Double.compare(this.radius, other.radius);
    }

    @Override
    public String toString() {
        return "Circle(radius: " + radius + ")";
    }
}
