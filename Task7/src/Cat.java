public class Cat extends Animal{
    private String fluffiness;

    public Cat (){}

    public Cat(String food, String location, String fluffiness) {
        super(food, location);
        this.fluffiness = fluffiness;
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