package frontend;

import java.util.Scanner;

public class Exercise2Question2 {
    public static void main(String[] args) {
        backend.Exercise2Question2 exercise2Question2 = new backend.Exercise2Question2();
        Scanner scanner = new Scanner(System.in);
        int choose;

        do {
            loadMenu();
            System.out.println("Nhập lựa chọn");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    exercise2Question2.input();
                    break;
                case 2:
                    exercise2Question2.DisplayStudent();
                    break;
                case 3:
                    exercise2Question2.xetHocBong();
                    break;
                default:
                    System.out.println("Bye!");
            }

        }while (choose != 4);

    }

    public static void loadMenu(){
        System.out.println("================");
        System.out.println("=   1. Nhập    =");
        System.out.println("=   2. Display =");
        System.out.println("=   3. Set     =");
        System.out.println("=   4. Exit    =");
        System.out.println("================");
    }
}
