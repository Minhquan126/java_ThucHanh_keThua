package kethua;

public class Main {
    public static void main(String[] args) {
        System.out.println("========Shape=========");
        Shape shape = new Shape("green",false);
        System.out.println(shape);
        System.out.println("========Circle=========");
        Circle circle = new Circle("red",true,2);
        System.out.println(circle);
        System.out.println("========Rectangle=========");
        Rectangle rectangle = new Rectangle("blue",true,2,4);
        System.out.println(rectangle);
        System.out.println("========Square=========");
        Square square = new Square("black",false,2);
        System.out.println(square);
    }
}
