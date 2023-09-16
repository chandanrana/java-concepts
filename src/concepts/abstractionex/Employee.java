package concepts.abstractionex;

public abstract class Employee {
    protected final int x;

    public Employee() {
        this.x = 10;
    }

    abstract void dressCode();

    void show(){
        System.out.println("x - "+x);
    }

}
