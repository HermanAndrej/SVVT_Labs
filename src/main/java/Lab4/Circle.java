package Lab4;

public class Circle {

    private int radius;

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle (int radius) {
        this.radius = radius;
    }


    public double calculateCircleArea() {
        return radius*radius*Math.PI;
    }
}
