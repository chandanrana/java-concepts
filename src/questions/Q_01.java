
// Qns. How can we create object of a class which is having private constructor?
public class Q_01 {

    static class Employee {
        private int id;
        private String name;

        private Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        private static Employee create(int id , String name){
            return new Employee(id, name);
        }
    }

    public static void main(String[] args) {
        Employee employee = Employee.create(12, "Rocky");

    }
}
