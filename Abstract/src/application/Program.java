package application;

import entities.Shape;
import entities.Square;
import entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(12.0,13.0);
        Shape square = new Square(13.0,13.0);

        System.out.println(square.area());
        System.out.println(rectangle.area());

    }
}
