package Practice1;

public class Circle extends Shape {
    public Circle(double radius) {
        super(radius, radius); // Using the same width and height for simplicity (assuming circle is inscribed in a square)
    }

    public double getArea() {
        return Math.PI * width * height; // Using width and height for circle area calculation for consistency
    }

    public double getCircumference() {
        return 2 * Math.PI * width; // Using width for circle circumference calculation for consistency
    }
}
