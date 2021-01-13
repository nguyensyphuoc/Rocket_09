package Entity.Exercise4;

public class Circle {
    private double radius;
    private String color;
    private float PI = 3.14f;

    public Circle() {
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return PI * Math.pow(radius, 2.0);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", PI=" + PI +
                '}';
    }
}
