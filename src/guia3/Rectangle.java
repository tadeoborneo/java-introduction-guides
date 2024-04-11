package guia3;

import java.util.Objects;

public class Rectangle implements GeometricFormulas{
    private Double height;
    private Double width;

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        return Objects.equals(getHeight(), rectangle.getHeight()) && Objects.equals(getWidth(), rectangle.getWidth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth());
    }

    @Override
    public Double getArea() {
        return this.height * this.width;
    }

    @Override
    public Double getPerimeter() {
        return (this.width * 2) + (this.height * 2);
    }
}
