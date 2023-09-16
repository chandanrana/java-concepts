package concepts;

public class AnonymousInnerClass {
    static class A {
        public void show() {
            System.out.println("In show A");
        }
    }

    static class B extends A {
        @Override
        public void show() {
            System.out.println("In show B");
        }
    }

    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("Anonymous Inner Class A");
            }
        };
        obj.show();
    }
}
