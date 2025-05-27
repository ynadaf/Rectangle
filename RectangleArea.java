public class RectangleArea {
    private double length;
    private double breadth;

    public RectangleArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea(10, 5);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
}
}