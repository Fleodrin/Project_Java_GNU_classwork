package Static;

public class Student {
    static int numStudentRegistered = 0;

    Student() {
        numStudentRegistered += 1;
    }
}

class test {
    public static void main(String[] args) {
        System.out.println(Student.numStudentRegistered);
    }
}


