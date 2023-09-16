package concepts.serialization;

import java.io.Serializable;

public class Student implements Serializable {
    public int id;
    public String name;
    transient String marks;

    public Student(int id, String name, String marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks='" + marks + '\'' +
                '}';
    }
}