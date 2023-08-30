package Collections.ProblemStatement3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        List<Student> students=  new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1 add student");
            System.out.println("2 add teacher");
            System.out.println("3 teacher detail");
            System.out.println("4 student detail");
            System.out.println("5 to exit");
            int c = sc.nextInt();
            sc.nextLine();
            switch (c) {
                case 1:
                    System.out.println("Enter name");
                    String name = sc.nextLine();
                    System.out.println("enter age");
                    int age = sc.nextInt();
                    int roll = students.size()+1;
                    Student student = new Student(name,age,roll);
                    if(age>3)
                    students.add(student);
                    break;
                case 2:
                    System.out.println("teacher name");
                    String tName = sc.nextLine();
                    System.out.println("enter salary");
                    int salary = sc.nextInt();
                    Teacher teacher = new Teacher(tName,salary);
                    if(salary>10000)
                    teachers.add(teacher);
                    break;
                case 3:
                    for (Teacher a:teachers) {
                        System.out.println(a);
                    }
                    break;
                case 4:
                    for (Student a:students) {
                        System.out.println(a);
                    }
                    break;
                case 5:
                    System.out.println("exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid input");
            }
        }
    }
}
