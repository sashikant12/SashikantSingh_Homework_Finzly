package Question5.me;

public class Student {
    private int studentId;
    private String name;
     static int totalStudent;


    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;

    }

    public int enroll(int student){
        return totalStudent+=student;
    }
    public int drop(int student){
        return totalStudent-=student;
    }

    public static void main(String[] args) {
        Student s = new Student(11222,"Sashi");
        System.out.println(s.enroll(4));
        System.out.println(s.drop(2));
    }
}
