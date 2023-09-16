package concepts.serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        Student student = new Student(1, "Chandan", "97");
        File file = new File("/Users/inspironlabs/Desktop/learning/java-concepts/src/concepts/serialization/student.txt");
        try{
            serializeEmployee(file, student);
            System.out.println(deserializeEmployee(file));
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private static void serializeEmployee(File file, Student student) throws IOException{
        try(FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ){
            objectOutputStream.writeObject(student);
        }
    }
    private static Student deserializeEmployee(File file) throws IOException, ClassNotFoundException{
        try(FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ios = new ObjectInputStream(fis)
        ){
            Object obj = ios.readObject();
            return (Student) obj;
        }
    }
}