package concepts.polymorphism;

public class Qna01 {
    static class A {
        public void show(A a){
            System.out.println("In show method A, address: "+ a);
        }
    }

    static class B extends A{
        public void show(B b){
            super.show(b);
            System.out.println("In show method B, address: "+b);
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.show(a); // In show method A

        a = new B();
        a.show(a); // In show method A: Because of method hiding

        B b = new B();
        b.show(b); // In show method B
        b.show(null); // In show method B

        a = b;
        a.show(null); // In show method A
        a.show(new B()); // In show method A
    }
}
