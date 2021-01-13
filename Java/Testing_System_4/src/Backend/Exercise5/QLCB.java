package Backend.Exercise5;

import Entity.Exercise5.Question1.CanBo;
import Entity.Exercise5.Question1.CongNhan;
import Entity.Exercise5.Question1.KySu;
import Entity.Exercise5.Question1.NhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private List<CanBo> canBos;
    private Scanner scanner;

    public QLCB() {
        canBos = new ArrayList<>();

    }

    // them moi can bo
    public void addCanBo() {
        CanBo canBo = new CanBo();
        System.out.println("Nhập số các bộ muốn thêm: ");
        int n = scanner.nextInt();

        int choose;
        for (int i = 0; i < n; i++) {
            System.out.println("Bạn muốn nhập vị trí nào?(1.nhân viên 2. Kỹ sư 3. nhân viên)");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    canBo = new CongNhan();
                    break;
                case 2:
                    canBo = new KySu();
                    break;
                case 3:
                    canBo = new NhanVien();
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Nhập sao!,  vuui lòng nhập lại!");
            }
        }
    }

    // tim kiem theo ten
    public void findByName() {
        scanner = new Scanner(System.in);
        System.out.println("Nhập tên muốn tìm: ");
        String name = scanner.nextLine();
        for (CanBo canBo : canBos) {
            if (name.equals(canBo.getName())){
                canBo.getInfo();
            }
        }
    }

    // in thong tin can bo
    public void printListCanBo() {
        for (CanBo canBo : canBos) {
            canBo.getInfo();
        }
    }
//
//    // tim kiem theo ten
//    public void delete(String name) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập tên cần tìm: ");
//        String name =
//
//    }

    // tim kiem theo ten va xoa can bo do di
    public void deleteCanBo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên muốn delete: ");
        String nameDelete = scanner.nextLine();

        canBos.removeIf(cb -> nameDelete.equals(cb.getName()));
    }

    public void loadMenu() {
        System.out.println("=======MENU==========");
        System.out.println("==  1. Thêm cán bộ ==");
        System.out.println("==  2. Hiện cán bộ ==");
        System.out.println("==  3. Tìm cán bộ  ==");
        System.out.println("==  4. Xóa cán bộ  ==");
        System.out.println("==  0. Thoát       ==");
        System.out.println("=====================");
    }
}
