package backend;

import entity.Exercise2.Question2.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2Question2 {
    private Scanner scanner;
    private List<Student> students;

    public void Question2() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void input() {
        System.out.println("Nhập số sinh viên muốn nhập: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1));
            students.add(new Student());
        }
    }

    public void DisplayStudent() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void xetHocBong() {
        System.out.println("Nhập theo tên(0) hay id(1) ?");
        byte select;
        select = scanner.nextByte();
        switch (select) {
            case 1:
                System.out.println("Nhập id: ");
                int id = scanner.nextInt();
                for (Student student : students) {
                    if (student.getId() == id) {
                        if (student.rankStudent()) {
                            System.out.println("Student này được học bổng !");
                        } else {
                            System.out.println("Student này không được học bổng !");
                        }
                        break;
                    }
                }
            default:
                System.out.println("Nhập name: ");
                String name = scanner.nextLine();
                for (Student student : students) {
                    if (student.getName().equals(name)) {
                        if (student.rankStudent()) {
                            System.out.println("Student này được học bổng !");
                        } else {
                            System.out.println("Student này không được học bổng !");
                        }
                        break;
                    }
                }
        }
    }
}
