package concepts.constructor;

/**
 *
 */
public class Student {
    public int id;
    public String name;

    public Student(int id, String name) {
        this(name); // Should be in the first line always
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }

    /**
     * Copy Constructor: Creating object from its another instance is called copy constructor
      */
    public Student(Student student){
        this(student.id, student.name);
    }

//    public Student(Student student){
//        this.id = student.id;
//        this.name = student.name;
//    }
}
