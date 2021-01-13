package backend;

import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseOne {
    private List<Student> students;
    private Scanner scanner;

    public ExerciseOne() {
        setupStudent();
    }

    public void setupStudent(){
        students = new ArrayList<>();
        students.add(new Student("Chinh"));
        students.add(new Student("Khanh"));
        students.add(new Student("Phuoc"));
        students.add(new Student("Tien"));
        students.add(new Student("Trong"));
        students.add(new Student("Tuan"));
    }
    // cau a
    public void sentenceA(){
        System.out.println("So luong student: " + students.size());
    }

    // cau b
    public void sentenceB(){
        System.out.println("Phan tu thu 4 la" + students.get(3));
    }
    // cau c
    public void sentenceC(){
        System.out.println("Phan tu dau tien la" + students.get(0));
        System.out.println("Phan tu cuoi cung la" + students.get(students.size() - 1));
    }
    // Cau d
    public void sentenceD(){
        System.out.println("Them phan tu vao dau:");
        students.add(0, new Student("An"));
        System.out.println(students.get(0));
    }
}
