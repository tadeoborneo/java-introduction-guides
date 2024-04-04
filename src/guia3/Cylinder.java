package guia3;
public class Cylinder extends Circle {
    private Double height = 1d;


    public Cylinder(Double radius, String color, Double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(Double height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of "+super.toString()+
                ". Height= "+this.height;
    }

    public Double cylinderVolume() {
        return super.area() * this.height;
    }

    @Override
    public Double area() {
        return (2d * Math.PI * getRadius() * getHeight()) + 2d * super.area();
    }
}
