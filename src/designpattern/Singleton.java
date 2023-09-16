package designpattern;

public class Singleton {
    private static Singleton obj;

    private Singleton(){}

    // synchronized make sure that only one thread can execute on getInstance()
    public static synchronized Singleton getInstance() {
        if(obj == null) {
            obj = new Singleton();
        }
        return obj;
    }
}