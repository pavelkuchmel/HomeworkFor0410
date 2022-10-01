public class Main {
    public static void main(String[] args) {
        Vet vet = new Vet("Nikolay");
        Animal[] animals = {new Cat("мясо", "деревня", "невероятно пушистый"),
                new Dog("кости", "будка", 9000), new Horse("сено", "конюшня", 2100)};
        for (int i = 0; i < animals.length; i++){
            vet.treatAnimal(animals[i]);
            System.out.println();
        }
    }
}