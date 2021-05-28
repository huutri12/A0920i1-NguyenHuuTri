package B7_Abstract_Class_JAVA.Interface.BaiTap.baitapResize;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

        rectangle.resize(30);
        System.out.println(rectangle.getArea());
    }
}
