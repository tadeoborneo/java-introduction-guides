package guia3;

public class Circle {
    private Double radius = 1d;
    private String color = "red";

    public Circle(Double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public Double area() {
        return (Math.PI * Math.pow(this.radius,2d));
    }
}
