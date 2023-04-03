package Classes;

public class Student {
    String name;
    int studentId;
    String email;
    String phoneNumber;

    Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    void printName() {
        System.out.println(name);
    }
}