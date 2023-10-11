package java8.functionalinterfaceex;


@FunctionalInterface
public interface A {

    void print();
    default void show() {
        System.out.println("In show A");
    }
}
