package Entity.Exercise5.Question4;

import java.util.Scanner;

public class Newspaper extends Document{
    private String releaseDate;

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày phát hành: ");
        releaseDate = scanner.nextLine();
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.print("Ngày phát hành: " + releaseDate);
    }
}
