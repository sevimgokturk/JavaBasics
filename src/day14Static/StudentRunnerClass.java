package day14Static;

public class StudentRunnerClass {
    public static void main(String[] args) {
        // to access static class members class name is enough to access
        System.out.println(Student.counter);
// to access non static crate obj
        Student obj1 =new Student();
        System.out.println(obj1.setStudentId());




    }
}
