package Entity.Exercise5.Question1;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private int bac;

    public CongNhan(String name, int age, Gender gender, String address, int bac) {
        super(name, age, gender, address);
        this.bac = bac;
    }

    public CongNhan() {

    }

    public void input(){
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bậc của công nhân!");
        bac = scanner.nextInt();
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Bậc " + bac);
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
}
