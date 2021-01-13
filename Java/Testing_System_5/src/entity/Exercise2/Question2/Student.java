package entity.Exercise2.Question2;

import java.util.Scanner;

public class Student extends Person{
    private int id;
    private float gpa;
    private String email;

    public Student() {
    }

    public Student(int id, float gpa, String email) {
        this.id = id;
        this.gpa = gpa;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        id = scanner.nextInt();

        System.out.println("Nhập điểm trung bình: ");
        gpa = scanner.nextFloat();

        System.out.println("Nhập email: ");
        email = scanner.nextLine();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Mã sinh viên: " + id);
        System.out.println("Điểm trung bình của sinh viên: " + gpa);
        System.out.println("Email sinh viên: " + email);
    }

    public boolean rankStudent(){
        return gpa >= 8.0f;
    }
}
