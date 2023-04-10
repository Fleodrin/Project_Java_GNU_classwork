package Classes;

public class Student {
    String name;
    boolean studentMale;
    String email;
    String phoneNumber;

    Student(String name, boolean studentId) {
        this.name = name;
        this.studentMale = false;
    }

    void printName() {
        System.out.println(name);
    }
}