public class Rectangle extends Shape{
    private int a;
    private int b;

    public Rectangle(){}

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    protected void draw() {
        char[][] array = new char[b][a];
        for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++) {
                    if (i > 0 && i < array.length-1 && j > 0 && j < array[i].length-1)array[i][j] = ' ';
                    else array[i][j] = 'o';
                }
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
