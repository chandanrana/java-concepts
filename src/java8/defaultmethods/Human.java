package java8.defaultmethods;

public interface Human {
    default void defaultFeature() {
        System.out.println("Human Breath");
    }

    static void mainBehaviour(){
        System.out.println("Human can think");
    }
}
