package backend.Ex1Question2;

import entity.Exercise1.Question2.Examinee;

import java.util.Scanner;

public class Exercise1Question2 {
    public void Question2(){
        TuyenSinh tuyenSinh = new TuyenSinh();
        Scanner scanner = new Scanner(System.in);

        int choose;
        do {
            loadMenu();
            System.out.println("NHập lựa chọn");
            choose = scanner.nextInt();

            switch (choose){
                case 1:
                    tuyenSinh.add();
                    break;
                case 2:
                    tuyenSinh.display();
                    break;
                case 3:
                    tuyenSinh.find();
                    tuyenSinh.display();
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    break;
            }
        }while (choose != 4);
    }

    public void loadMenu(){
        System.out.println("===========MENU===========");
        System.out.println("1. Thêm thí sinh      ====");
        System.out.println("2. Hiển thị thông tin ====");
        System.out.println("3. Tìm kiếm theo SBD  ====");
        System.out.println("4. Exit               ====");
        System.out.println("==========================");
    }
}
