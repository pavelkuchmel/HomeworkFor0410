import java.util.Objects;

public abstract class Shape {
    private String color;
    public Shape(){}

    public Shape(String color){
        this.color = color;
    }

    protected abstract void draw();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return color.equals(shape.color);
    }

}
