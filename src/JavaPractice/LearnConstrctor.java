package JavaPractice;

public class LearnConstrctor {

    public static void main(String[] args) {

        //constructor A special method to initialize objects you can pass arugments to a constructor and set up initital values

        Student s1 = new Student("A", 30, 3);

        Student s2 = new Student("B", 22, 10);

        s1.study();
        s2.study();

    }
}
