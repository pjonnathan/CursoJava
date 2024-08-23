package entities;

public class Square extends Shape{

    public Square(double height, double width) {
        super(height, width);
    }

    @Override
    public double area() {
        return Math.pow(height, 2);
    }
}
