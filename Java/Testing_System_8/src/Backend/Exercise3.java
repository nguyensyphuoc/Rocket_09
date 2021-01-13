package Backend;

import Entity.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercise3 {
    private Set<Student> students;
    private Scanner scanner;

    public void sentence1() {
        scanner = new Scanner(System.in);
        students = new HashSet<>();
        inputStudents();
    }

    private void inputStudents() {
        students.add(new Student("Nguyễn Văn A"));
        students.add(new Student("Nguyễn Văn B"));
        students.add(new Student("Nguyễn Văn C"));
        students.add(new Student("Nguyễn Văn D"));
        students.add(new Student("Nguyễn Văn E"));
        students.add(new Student("Nguyễn Văn H"));
    }

    public void DisplayStudent() {
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }
    }

    // cau a
    public void sentenceA(){
        System.out.println("Tổng số sinh viên: " + students.size());
    }

    // cau b: lấy phần tử thứ 4 của student
    public void sentenceB(){
        Iterator<Student> studentIterator = students.iterator();

        System.out.println("Student thứ 4 là: " );
        System.out.println(studentIterator.next());
    }

    public void sentenceC(){

    }
}
