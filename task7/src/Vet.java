public class Vet {
    private String name;

    public Vet(){}

    public Vet(String name){
        this.name = name;
    }
    public void treatAnimal(Animal animal){
        animal.eat();
        System.out.println(animal.food);
        System.out.println("Место проживания: " + animal.location);
    }
}
