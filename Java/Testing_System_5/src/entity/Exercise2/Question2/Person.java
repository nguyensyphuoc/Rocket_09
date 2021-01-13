package entity.Exercise2.Question2;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Person {
    private String name;
    private Gender gender;
    private LocalDate birthDate;
    private String address;

    public Person() {
    }

    public Person(String name, Gender gender, LocalDate birthDate, String address) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập name: ");
        name = scanner.nextLine();

        System.out.println("Nhập giới tính: ");
        System.out.println("0 (Nam), 1(Nữ), còn lại: Unknown !");
        byte choose = scanner.nextByte();
        if (choose == 0){
            gender = Gender.valueOf("MALE");
        }else if (choose == 1){
            gender = Gender.valueOf("FEMALE");
        }else{
            gender = Gender.valueOf("UNKNOWN");
        }

        System.out.println("Nhập ngày sinh: ");
        birthDate = LocalDate.parse(scanner.nextLine());

        System.out.println("Nhập địa chỉ: ");
        address = scanner.nextLine();
    }

    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Giới tính: " + gender);
        System.out.println("Ngày sinh: " + birthDate);
        System.out.println("Địa chỉ: " + address);
    }
}
