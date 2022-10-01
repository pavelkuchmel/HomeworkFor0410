public class Horse extends Animal{
    int height;

    public Horse(){}

    public Horse(String food, String location, int height) {
        super(food, location);
        this.height = height;
    }

    @Override
    public void makeNoise() {
        System.out.print("���� ����");
    }

    @Override
    public void eat() {
        System.out.print("���� ��� ");
    }

    @Override
    public void sleep() {
        System.out.print("���� ����");
    }
}