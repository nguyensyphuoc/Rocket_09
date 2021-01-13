package backend;

import entity.Student;

public class Exercise1 {
    public void Question1(){
        Student student = new Student(1, "Nguyễn Văn A");
        Student student1 = new Student(2, "Nguyễn Văn B");
        Student student2 = new Student(3, "Nguyễn Văn C");
        System.out.println(student.getId() + student.getName());
        System.out.println(student1.getId() + student.getName());
        System.out.println(student2.getId() + student.getName() + Student.getCollege());
    }
}
