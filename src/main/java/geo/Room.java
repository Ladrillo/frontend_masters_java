package geo;

public class Room {
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
