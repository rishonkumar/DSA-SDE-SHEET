package JavaPractice;

public class Student {

    String name;
    int age;
    int grade;
    boolean isEnrolled;


    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.isEnrolled = true;
    }

    void study() {
        System.out.println(this.name + " is studying");
    }
}
