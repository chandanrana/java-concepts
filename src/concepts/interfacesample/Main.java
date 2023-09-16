package concepts.interfacesample;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.createAnimal();
        animal.eat();
        animal.show();

        String a = "1234";
        System.out.println(a.contains("12"));
    }
}
