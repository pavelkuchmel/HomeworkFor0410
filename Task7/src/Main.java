public class Main {
    public static void main(String[] args) {
        Vet vet = new Vet("Nikolay");
        Animal[] animals = {new Cat("����", "�������", "���������� ��������"),
                new Dog("�����", "�����", 9000), new Horse("����", "�������", 2100)};
        for (int i = 0; i < animals.length; i++){
            vet.treatAnimal(animals[i]);
            System.out.println();
        }
    }
}