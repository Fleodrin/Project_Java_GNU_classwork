package Static;

public class Student {
    static int numStudentRegistered = 0;

    Student() {
        numStudentRegistered += 1;
    }
}

class test {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();

        System.out.println(Student.numStudentRegistered);
    }
}


