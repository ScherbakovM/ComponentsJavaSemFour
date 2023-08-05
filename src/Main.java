public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 5, 7 );
        System.out.println(triangle.getArea());

        Rectangle rectangle = new Rectangle(5,7);
        System.out.println(rectangle.getPerimeter());

        Rectangle rectangle1 = new Rectangle(2,3);
        System.out.println(rectangle1.getArea());
    }
}