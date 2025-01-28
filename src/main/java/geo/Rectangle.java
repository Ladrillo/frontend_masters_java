package geo;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        setHeight(height);
        setWidth(width);
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
