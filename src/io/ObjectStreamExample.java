package io;

import java.io.*;

// Serializable class
class Student implements Serializable {
    String name;
    int age;
    transient String password; // This field will NOT be serialized

    public Student(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
}

public class ObjectStreamExample {
    public static void main(String[] args) {
        Student originalStudent = new Student("Alice", 22, "secret123");

        // File to save the object
        String filename = "student.ser";

        // 1️⃣ Serialize (Save) the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(originalStudent);
            System.out.println("✅ Object saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2️⃣ Deserialize (Load) the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Student loadedStudent = (Student) ois.readObject();
            System.out.println("\n✅ Object loaded:");
            System.out.println("Name: " + loadedStudent.name);
            System.out.println("Age: " + loadedStudent.age);
            System.out.println("Password (transient): " + loadedStudent.password); // will be null
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
