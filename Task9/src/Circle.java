import java.util.Objects;

public class Circle extends Shape{
    private double x;
    private double y;

    public Circle(){}

    public Circle(String color, double x, double y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    protected void draw() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.x, x) == 0 && Double.compare(circle.y, y) == 0;
    }

}
