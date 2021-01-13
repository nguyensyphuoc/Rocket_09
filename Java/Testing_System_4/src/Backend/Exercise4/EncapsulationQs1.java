package Backend.Exercise4;

import Entity.Exercise4.Student;

public class EncapsulationQs1 {
    public void Question1(){
        // Question 1:
        // Tạo Object Student có các property id, name, hometown, điểm học lực
        // a) Tất cả các property sẽ để là private để các class khác không chỉnh sửa hay
        // nhìn thấy
        // b) Tạo constructor cho phép khi khởi tạo mỗi student thì người dùng sẽ nhập
        // vào tên, hometown và có điểm học lực = 0
        // c) Tạo 1 method cho phép set điểm vào
        // d) Tạo 1 method cho phép cộng thêm điểm
        // e) Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên, điểm học lực
        // ( nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm > 4.0 và < 6.0 thì sẽ in ra là
        // trung bình, nếu điểm > 6.0 và < 8.0 thì sẽ in ra là khá, nếu > 8.0 thì in ra
        // là Giỏi)
        // Demo các chức năng trên bằng class ở front-end.

        Student student = new Student("Nguyễn Sỹ Phước", "Bắc Ninh");
        student.setGpa(10);
        Student student1 = new Student("Nguyễn Sỹ Phước1", "Bắc Ninh");
        student1.setGpa(9);
        Student student2 = new Student("Nguyễn Sỹ Phước2", "Bắc Ninh");
        student2.setGpa(9);

        student2.plusGpa(1);

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
    }
}
