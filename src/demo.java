import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập chiều rộng!!");
        double width = scanner.nextDouble();
        System.out.println("Mời nhập chiều cao!!");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        double area = rectangle.getArea();
        System.out.println(area);
        double perimeter = rectangle.getPerimeter();
        System.out.println(perimeter);
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getWidth());
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getWidth());
    }
}
