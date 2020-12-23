package B7_Abstract_Class_JAVA.Interface.BaiTap.baitapResize;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);
        System.out.println(square.getArea());

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

        square.resize(40);
        System.out.println(square.getArea());
    }
}
