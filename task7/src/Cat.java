public class Cat extends Animal{
    private String fluffiness;

    public Cat (){}

    public Cat(String food, String location, String fluffiness) {
        super(food, location);
        this.fluffiness = fluffiness;
    }

    @Override
    public void makeNoise() {
        System.out.print("Кот мяукает");
    }

    @Override
    public void eat() {
        System.out.print("Кот ест ");
    }

    @Override
    public void sleep() {
        System.out.print("Кот спит");
    }
}
