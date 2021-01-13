package backend;

import entity.Exercise2.Question1.Student;

public class Exercise2Question1 {
    private Student[] students;
    public void StudentsArray(){
        students = new Student[10];
    }

    public void addStudent(){
        students[1] = new Student(1, "A", 1);
        students[2] = new Student(2, "B", 1);
        students[3] = new Student(3, "C", 1);
        students[4] = new Student(4, "D", 1);
        students[5] = new Student(5, "E", 2);
        students[6] = new Student(6, "F", 2);
        students[7] = new Student(7, "G", 2);
        students[8] = new Student(8, "H", 3);
        students[9] = new Student(9, "K", 3);
        students[10] = new Student(10, "L", 3);
    }

    public void caLopDiemDanh(){
        System.out.println("Gọi cả lớp điểm danh!");
        for (int i = 0; i < students.length; i++){
            students[i].diemDanh();
        }
    }

    public void nhomDiHocBai(){
        System.out.println("Gọi nhóm 1 đi học bài!");
        for (int i = 0; i < students.length; i++){
            if (students[i].getGroup() == 1){
                students[i].hocBai();
            }
        }
    }

    public void nhomDiDonVeSinh(){
        System.out.println("Gọi nhóm 2 đi dọn vệ sinh");
        for (int i = 0; i < students.length; i++){
            if (students[i].getGroup() == 2){
                students[i].diDonVeSinh();
            }
        }
    }
}
