public class Circle  extends Shape{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getS(){
        return radius * radius *Math.PI;
    }
    public double getC(){
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return  "A Rectangle with radius = " + radius + ", which is a subclass of " + super.toString() ;
    }
}
