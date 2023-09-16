package concepts.interfacesample;

public class Dog implements Animal{

    @Override
    public void createAnimal() {
        System.out.println("Dog");
    }

    @Override
    public void show() {
        System.out.println("Inside Show");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats non-veg");
    }

    @Override
    public void color() {
        System.out.println("Dog Color: Grey");
    }
}
