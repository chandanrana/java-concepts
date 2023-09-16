package concepts;

// Ways to create object during runtime
public class Test {

    static String str;
    public Test(){

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {

        // 1. new Keyword
        Test test = new Test();

        // 2. new instance
        try {
            Class aClass= Class.forName("Test");
            Test test1 = (Test) aClass.newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        // 3. using clone()

        try {
            Test cloneTest = (Test) test.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}