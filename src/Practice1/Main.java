package Practice1;

public class Main {
    public static void main(String[] args) {
    	Shape shape = new Shape(1,2);
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);
        
        System.out.println("Shape:");
        System.out.println("Height: " + shape.getHeight());
        System.out.println("Width: " + shape.getWidth());
        
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}
