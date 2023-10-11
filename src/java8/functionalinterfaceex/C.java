package java8.functionalinterfaceex;

public class Main implements A, B{

    @Override
    public void show() {
        A.super.show();
    }
}
