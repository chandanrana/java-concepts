package java8.functionalinterfaceex;

public interface Company {

    String ONE = "ONE";

    default void show(){
        System.out.println("Inspironlabs");
    }
}