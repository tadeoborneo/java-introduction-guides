package guiaUno;

public class Rectangle {
    private Float width = 1f;
    private Float height = 1f;

    public Rectangle() {
    }

    public Rectangle(Float width, Float height) {
        this.width = width;
        this.height = height;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float rectangleArea() {
        return width * height;
    }

    public Float rectanglePerimeter(){
        return 2 * width + 2 * height;
    }


}
