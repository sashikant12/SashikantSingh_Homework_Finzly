package Question3.me;

import java.util.Random;

public class Student {
    private String name;
    private int age;
    private int studentId;

    Random random = new Random();

    public Student() {
        name="unknown";
        age=0;
        studentId= random.nextInt(100);
    }

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = random.nextInt(100);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.studentId= random.nextInt(100);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId=" + studentId +
                '}';
    }

    public static void main(String[] args) {
        Student a = new Student();
        System.out.println(a.toString());
        Student z = new Student("aa",12,12);
        System.out.println(z.toString());
        Student d = new Student("ss",12);
        System.out.println(d.toString());
        Student a1 = new Student();
        System.out.println(a1.toString());
        Student a2 = new Student();
        System.out.println(a2.toString());
        Student a3 = new Student();
        System.out.println(a3.toString());
        Student a4 = new Student();
        System.out.println(a4.toString());




    }
}
