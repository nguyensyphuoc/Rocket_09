package Entity.Exercise5.Question1;

import java.util.Scanner;

public class CanBo {
    protected String name;
    protected int age;
    protected Gender gender;
    protected String address;

    public CanBo(String name, int age, Gender gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public CanBo(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(int gender) {
        if (gender == 0){
            this.gender = Gender.valueOf("Nữ");
        } else  if (gender == 1){
            this.gender = Gender.valueOf("FEMALE");
        } else {
            this.gender = Gender.valueOf("UNKNOWN!");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        name = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        age = scanner.nextInt();

        System.out.println("Nhập giới tính: (1:Nam - 0:Nữ - Khác: Unknown)");
        setGender(scanner.nextInt());

        System.out.println("Nhập địa chỉ: ");
        address = scanner.nextLine();
    }

    public void getInfo(){
        System.out.println("Ho ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Dia chi: " + address);
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }
}
