package Entity.Exercise5.Question4;

import java.util.Scanner;

public class Journal extends Document{
    private int issueNumber;
    private byte monthOfRelease;;

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public byte getMonthOfRelease() {
        return monthOfRelease;
    }

    public void setMonthOfRelease(byte monthOfRelease) {
        this.monthOfRelease = monthOfRelease;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phát hành: ");
        issueNumber = scanner.nextInt();
        System.out.println("Nhập tháng phát hành: ");
        monthOfRelease = scanner.nextByte();
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.print("Số phát hành: " + issueNumber);
        System.out.print("Tháng phát hành: " + monthOfRelease);
    }
}
