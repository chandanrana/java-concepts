package concepts.methodhiding;

class A {
    public static void show()
    {
        System.out.println("In A ");
    }
}
class B extends A {
    public static void Show()
    {
        System.out.println("In B");
    }
}
public class MethodHidingSample {
    public static void main(String[] args) {
        A d1 = new A();

        A d2 = new B();

//        d1.show();
        d2.show();
    }
}
