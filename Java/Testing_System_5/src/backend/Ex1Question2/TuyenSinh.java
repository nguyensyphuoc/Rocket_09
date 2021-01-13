package backend.Ex1Question2;

import entity.Exercise1.Question2.Examinee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh{
    private Scanner scanner;
    private List<Examinee> examineeList;

    public TuyenSinh() {
        examineeList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    @Override
    public void add() {
        System.out.println("Nhập số thí sinh muốn thêm");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            Examinee examinee = new Examinee();
            examinee.insertExaminee();
            examineeList.add(examinee);
        }
    }

    @Override
    public void display() {
        for (Examinee examinee: examineeList) {
            System.out.println(examinee);
        }
    }

    @Override
    public void find() {
        System.out.println("Nhập số báo danh: ");
        int soBaoDanh = scanner.nextInt();

        for (Examinee examinee: examineeList) {
            if (examinee.getSoBaoDanh().equals(soBaoDanh)){
                System.out.println(examinee.getSoBaoDanh());
            }
        }
    }
}
