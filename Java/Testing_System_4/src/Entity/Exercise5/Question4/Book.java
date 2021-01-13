package Entity.Exercise5.Question4;

import java.util.Scanner;

public class Book extends Document {
    private String author;
    private int numberOfPages;
//    private int id;
//    private String publishingCompany;
//    private String releaseNumber;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên tác giả: ");
        author = scanner.nextLine();

        System.out.println("Nhập số trang: ");
        numberOfPages = scanner.nextInt();
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Tác giả: " + author);
        System.out.println("Số trang: " + numberOfPages);

    }
}
