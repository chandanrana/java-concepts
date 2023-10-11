/*
Q.1 How can we compare the two object value?
Ans ==> We will use equals() operator.
Q.2 What is we need to do to use compare the values using .equals() operator?
Ans ==> We need to implement the .equals() method.
 */
public class Q_02 {
    static class Person {
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person(1, "Raj");
        Person p2 = new Person(2, "Ronny");
    }
}