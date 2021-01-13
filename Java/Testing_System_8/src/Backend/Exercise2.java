package Backend;

import Entity.Student;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exercise2 {

    public void sentence2(){
        System.out.println("Thứ tự sinh viên đến phòng thi từ muộn nhất đến sớm nhất!");
        printStudentComeEarly();
        System.out.println("--------------------------------------------");
        System.out.println("Thứ tự sinh viên đến phòng thi từ sớm nhất đến muộn nhất!");
        printStudentComeLate();

    }

    public void printStudentComeEarly(){
        //init data
        Stack<Student> students = new Stack<>();
        students.push(new Student("Cristiano Ronaldo"));
        students.push(new Student("Sergio Ramos"));
        students.push(new Student("Nguyễn Quang Hải"));
        students.push(new Student("Đoàn Văn Hậu"));
        students.push(new Student("Nguyễn Văn Messi"));

        //su dung pop de lay data trong stack
        System.out.println(students.pop());
        System.out.println(students.pop());
        System.out.println(students.pop());
        System.out.println(students.pop());
        System.out.println(students.pop());
    }

    public void printStudentComeLate(){
        Queue<Student> students = new LinkedList<>();
        students.add(new Student("Cristiano Ronaldo"));
        students.add(new Student("Sergio Ramos"));
        students.add(new Student("Nguyễn Quang Hải"));
        students.add(new Student("Đoàn Văn Hậu"));
        students.add(new Student("Nguyễn Văn Messi"));

        // su dung poll de lay data element trong stack
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
    }
}
