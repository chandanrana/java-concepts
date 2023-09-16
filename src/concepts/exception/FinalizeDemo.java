package concepts.exception;

public class FinalizeDemo {

    public static void main(String[] args) {

        FinalizeDemo demo = new FinalizeDemo();

        System.out.println("Hashcode is : "+demo.hashCode());

        demo = null;
        System.gc();

        System.out.println("End of the garbage collection");
    }

    @Override
    protected void finalize() {
        System.out.println("Called finalize method");
    }
}
