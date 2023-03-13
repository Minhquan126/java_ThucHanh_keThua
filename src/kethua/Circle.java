package kethua;

public class Circle extends Shape {
    private double radius;
    public double area;
    public double perimeter;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = 1;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        this.area = radius * Math.pow(radius, 2) * Math.PI;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "a Circle with radius " + getRadius() +
                " which is a subclass of " +
                super.toString()
               ;
    }
}
