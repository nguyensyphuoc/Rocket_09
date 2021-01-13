package backend.Ex1Question1;

import java.util.Scanner;

public class Exercise1Question1 {
    public void Question1() {
        MyNews myNews = new MyNews();
        Scanner scanner = new Scanner(System.in);

        int choose;
        do {
            loadMenu();
            System.out.println("Nhập lựa chọn: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    myNews.insertNews();
                    break;
                case 2:
//                    loadMenu();
                    myNews.DisplayNews();
                    break;
                case 3:
                    myNews.averageRate();
                    myNews.DisplayNews();
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Nhập lại!");
                    break;
            }
        } while (choose != 4);
    }

    public static void loadMenu() {
        System.out.println("--------------------");
        System.out.println("1. Insert news ");
        System.out.println("2. View list news");
        System.out.println("3. Average rate");
        System.out.println("4. Exit ");
        System.out.println("--------------------");
//        System.out.println();
    }
}
