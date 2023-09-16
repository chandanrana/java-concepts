package concepts.polymorphism;

public class Qna02 {
    static class A {
        void m1(Object obj){
            System.out.println("One");
        }
    }
    static class B extends A {
        void m1(Object obj){
            super.m1(null);
            System.out.println("Two");
        }
        void m2(Object obj){
            System.out.println("Three");
            this.m1(null);
        }
    }

    public static void main(String[] args) {
        A a = new B();
        a.m1(a);

        B b = new B();
        b.m2(b);
    }
}