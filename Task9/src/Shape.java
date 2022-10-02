public abstract class Shape {
    private String color;
    public Shape(){}

    public Shape(String color){
        this.color = color;
    }

    protected abstract void draw();

}
