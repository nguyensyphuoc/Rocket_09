package Entity.Exercise5.Question4;

import java.util.Scanner;

public class Document {
    private int id;
    private String publishingCompany;
    private int releaseNumber;
    private static int counter = 1000;

    public Document(int id, String publishingCompany, int releaseNumber) {
        this.id = id;
        this.publishingCompany = publishingCompany;
        this.releaseNumber = releaseNumber;
    }

    public Document() {
        id = ++counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập mã tài liệu: ");
        id = scanner.nextInt();

        System.out.println("Nhập số bản phát hành: ");
        releaseNumber = scanner.nextInt();

        System.out.println("Nhập tên nhà xuất bản: ");
        publishingCompany = scanner.nextLine();

    }

    public void getInfo() {
        System.out.println("Mã tài liệu: " + id);
        System.out.println("Nhà xuất bản: " + publishingCompany);
        System.out.println("Số bản phát hành: " + releaseNumber);
    }
}
