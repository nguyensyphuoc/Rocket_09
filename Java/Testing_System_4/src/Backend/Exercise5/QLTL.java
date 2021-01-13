package Backend.Exercise5;

import Entity.Exercise5.Question4.Book;
import Entity.Exercise5.Question4.Document;
import Entity.Exercise5.Question4.Journal;
import Entity.Exercise5.Question4.Newspaper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLTL {
    //Question 4:
//Một thư viện cần quản lý các tài liệu bao gồm Sách, Tạp chí, Báo. Mỗi tài liệu gồm có các thuộc tính sau: Mã tài liệu(Mã tài liệu là duy nhất), Tên nhà xuất bản, số bản phát hành.
//
//Các loại sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
//Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
//Các báo cần quản lý thêm: Ngày phát hành.
//
//Xây dựng chương trình để quản lý tài liệu (QLTV) cho thư viện một cách hiệu quả.
//Xây dựng lớp QuanLySach có các chức năng sau
//a)	Thêm mới tài liêu: Sách, tạp chí, báo.
//b)	Xoá tài liệu theo mã tài liệu.
//c)	Hiện thị thông tin về tài liệu.
//d)	Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.
//e)	Thoát khỏi chương trình.
    private List<Document> documentList;

    public QLTL() {
        documentList = new ArrayList<>();
    }

    public void themDocument() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tài liệu muốn nhập: ");
        int n = scanner.nextInt();
        Document document = new Document();
        for (int i = 0; i < n; i++) {
            System.out.println("Tài liệu muộn nhập? (1: Sách || 2: Tạp chí || 3: Báo) ");
            byte choose = scanner.nextByte();
            switch (choose) {
                case 1:
                    document = new Book();
                    break;
                case 2:
                    document = new Journal();
                    break;
                case 3:
                    document = new Newspaper();
                    break;
                default:
                    System.out.println("Nhập sai!");
                    i--;
                    break;
            }
            document.input();
            documentList.add(document);
        }
    }

    public void deleteDocument() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã tài liệu cần xóa: ");
        int idDocument = scanner.nextInt();

        for (Document document : documentList) {
            if (idDocument == document.getId()) {
                documentList.remove(document);
            }
        }
    }

    public void printDocument() {
        for (Document document : documentList) {
            document.getInfo();
        }
    }

    public void finDocument() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tài liệu muốn tìm: (1: Sách || 2: Tạp chí || 3: Báo) ");
        byte choose = scanner.nextByte();
        switch (choose) {
            case 1:
                for (Document document : documentList) {
                    if (document instanceof Book) {
                        document.getInfo();
                    }
                }
                break;
            case 2:
                for (Document document : documentList) {
                    if (document instanceof Journal) {
                        document.getInfo();
                    }
                }
                break;
            case 3:
                for (Document document : documentList) {
                    if (document instanceof Newspaper) {
                        document.getInfo();
                    }
                }
                break;
            default:
                System.out.println("Nhập sai !");
                break;
        }
    }
}
