package Frontend;

import Backend.Exercise5.QLTL;

import java.util.Scanner;

public class ProgramEx4Question4 {
    public static void main(String[] args) {
        Question4();
    }

    private static void loadMenu() {
        System.out.println("=======MENU==========");
        System.out.println("==  1. Thêm tài liệu ==");
        System.out.println("==  2. Hiện tài liệu ==");
        System.out.println("==  3. Tìm tài liệu  ==");
        System.out.println("==  4. Xóa tài liệu  ==");
        System.out.println("==  0. Thoát         ==");
        System.out.println("=====================");
    }

    public static void Question4() {
        QLTL qltl = new QLTL();

        byte choose;
        do {
            loadMenu();
            Scanner scanner = new Scanner(System.in);

            choose = scanner.nextByte();
            switch (choose) {
                case 1:
                    qltl.themDocument();
                    break;
                case 2:
                    qltl.printDocument();
                    break;
                case 3:
                    qltl.deleteDocument();
                    break;
                case 4:
                    qltl.finDocument();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nhập sai ! Nhập lại !");
                    break;
            }
        } while (choose != 0);
    }
}
