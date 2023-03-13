package kethua;

public class Rectangle extends Shape {
private double width = 1;
private double height = 1;
public double area;
public double perimeter;
public Rectangle() {
}

 public Rectangle (double width, double height) {
    this.width = width;
    this.height = height;
 }
 public Rectangle (String color, boolean filled, double width, double height) {
    super(color,filled);
    this.width = width;
    this.height = height;
 }

    public double getArea() {
        return area;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setArea() {
        this.area = width * height;
    }

    public double getPerimeter() {
        return perimeter;
    }
    public void setPerimeter() {
        this.perimeter = (width + height) * 2;
    }

    @Override
    public String toString() {
        return " a Rectangle with width" + width +
                ", height=" + height + "and which is a subclass " +
                super.toString()
                ;
    }
}
