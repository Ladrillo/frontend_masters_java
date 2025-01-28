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

  public static void main(String[] args) {
    Rectangle r = new Rectangle(3, 7);
    System.out.println(r.getArea());
    System.out.println(r.getPerimeter());
    System.out.println("================================");
    r.setWidth(5);
    r.setHeight(4);
    System.out.println(r.getArea());
    System.out.println(r.getPerimeter());
  }
}
