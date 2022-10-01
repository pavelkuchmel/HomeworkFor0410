public class Dog extends  Animal{
    int weight;

    public Dog(){}

    public Dog(String food, String location, int weight) {
        super(food, location);
        this.weight = weight;
    }

    @Override
    public void makeNoise() {
        System.out.print("��� �������");
    }

    @Override
    public void eat() {
        System.out.print("��� ��� ");
    }

    @Override
    public void sleep() {
        System.out.print("��� ����");
    }
}