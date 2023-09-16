package concepts.interfacesample;

public interface Animal extends Behaviour, Attributes {
    void createAnimal();
    void show();

    class Data {
        int a;
        int b;
    }
}
