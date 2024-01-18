/*Create a class hierarchy for geometric shapes. 
Define a base class Shape with methods to calculate area and perimeter. 
Create subclasses for Circle, Rectangle, and Triangle.*/

// Base class Shape
class Shape {
    public double calculateArea() {
        return 0; // Default implementation returns 0
    }
}

// Circle.java
// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Calculate area of circle
    }
}
// Subclass Rectangle
 class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height; // Calculate area of rectangle
    }
}
// Subclass Triangle
 class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height; // Calculate area of triangle
    }
}

public class LAB_Q3 {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(12, 34);
        System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(5, 9);
        System.out.println("\nArea of Triangle: " + triangle.calculateArea());
    }
}