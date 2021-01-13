package entity.Exercise1.Question2;

import java.util.Scanner;

public class Examinee {
    private String soBaoDanh;
    private String name;
    private String address;
    private float mucUuTien;

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public String getName(String name) {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public float getMucUuTien() {
        return mucUuTien;
    }

    public void insertExaminee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số báo danh: ");
        soBaoDanh = scanner.nextLine();

        System.out.println("Nhập tên thí sinh: ");
        name = scanner.nextLine();

        System.out.println("Nhập địa chỉ thí sinh: ");
        address = scanner.nextLine();

        System.out.println("Nhập số mức ưu tiên: ");
        mucUuTien = scanner.nextFloat();
    }

    @Override
    public String toString() {
        return "Examinee{" +
                "soBaoDanh='" + soBaoDanh + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mucUuTien=" + mucUuTien +
                '}';
    }
}
