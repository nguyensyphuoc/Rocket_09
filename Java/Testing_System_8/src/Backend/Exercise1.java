package Backend;

import Entity.Student;
import utils.ScannerUtils;

import java.util.*;

public class Exercise1 {
    private List<Student> students;
    private Scanner scanner;

    public Exercise1() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
        setupStudent();
    }

    public void setupStudent() {
        students = new ArrayList<>();
        students.add(new Student("A"));
        students.add(new Student("B"));
        students.add(new Student("C"));
        students.add(new Student("D"));
        students.add(new Student("E"));
    }
    public void DisplayStudent(){
        for (Student student: students) {
            System.out.println(student);
        }
    }

    //cau a
    public void sentenceA() {
        System.out.println("Số lượng student: " + students.size());
    }

    //cau b
    public void sentenceB() {
        System.out.println("Student thứ 4 là: " + students.get(3).toString());
    }

    // cau c
    public void sentenceC() {
        System.out.println("Student đầu tiên là: " + students.get(0));
        System.out.println("Studetn cuối cùng là: " + students.get(students.size() - 1));
        DisplayStudent();
    }

    // cau d
    public void sentenceD() {
        System.out.println("Thêm phần tử vào vị trí đầu");
        System.out.println("-------------------------");
        students.add(0, new Student("Thu Phương"));
        DisplayStudent();
    }

    // cau e
    public void sentenceE(){
        students.add(students.size(), new Student("Ngọc Trinh"));
        System.out.println("----------------------");
        System.out.println("List student after adding");
        DisplayStudent();
    }

    // cau f
    public void sentenceF(){
        // reverse student
        Collections.reverse(students);
        System.out.println("List student after reversing");
        DisplayStudent();
    }

    // cau g
    public void sentenceG(){
        System.out.print("Nhập id muốn tìm: ");
        int id = ScannerUtils.inputIntWithString(scanner);

        for (Student student: students) {
            if (student.getId() == id){
                System.out.println(student);
            }
        }
    }

    // cau h
    public void sentenceH(){
        System.out.print("Nhập name muốn tìm: ");
        String name = ScannerUtils.inputStringWithString(scanner);

        for (Student student: students) {
            if (student.getName().equals(name)){
                System.out.println(student);
            }
        }
    }

    // cau i
    public void sentenceI(){
        for (int i = 0; i < students.size(); i++){
            for (int j = i+1; j < students.size(); j++){
                if (students.get(i).getName().equals(students.get(j).getName())){
                    System.out.print("Các student trung tên là: ");
                    System.out.println(students.get(i));
                    System.out.println(students.get(j));
                }
            }
        }
    }

    //cau j
    public void sentenceJ(){
        for (Student student: students) {
            if (student.getId() == 2){
                System.out.println("Da xoa phan tu thu 2");
                student.setName(null);
            }
        }
        DisplayStudent();
    }

    public void sentenceK(){
        for (Student student : students){
            if (student.getId() == 5){
                students.remove(student);
                System.out.println("Da remove student thu 5");
            }
        }
        DisplayStudent();
    }
}
