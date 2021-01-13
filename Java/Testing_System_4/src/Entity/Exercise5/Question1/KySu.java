package Entity.Exercise5.Question1;

import java.util.Scanner;

public class KySu  extends CanBo{
    private String nganhDaoTao;

    public KySu(String name, int age, Gender gender, String address, String nganhDaoTao) {
        super(name, age, gender, address);
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu() {

    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.getInfo();
        System.out.println(" ngành đào tạo: ");
        nganhDaoTao = scanner.nextLine();

    }

    @Override
    public void getInfo() {
        super.input();
        System.out.println("Ngành đào tạo: " + nganhDaoTao);
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
}
