package entities;

public class Rectangle extends Shape{
    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double area() {
        return height * width;
    }
}
