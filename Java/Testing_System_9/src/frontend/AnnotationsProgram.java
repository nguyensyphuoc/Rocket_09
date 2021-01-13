package frontend;

import entity.Student;

import java.util.Date;
import java.util.Queue;

public class AnnotationsProgram {
    public static void main(String[] args) {
//        Question1();
        Question2();
    }

    @SuppressWarnings("deprecation")
    public static void Question1() {
        Date date = new Date(2021, 1, 10);
        System.out.println(date);
    }

    public static void Question2(){
        Student student = new Student(1, "Nguyễn Văn A");
        System.out.println(student.getId());
        System.out.println(student.getName());

        // TODO: 1/10/2021

        System.out.println(student.getIdV2());
    }
}
