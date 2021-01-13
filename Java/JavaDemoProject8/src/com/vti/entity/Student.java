package com.vti.entity;

import java.util.Scanner;

import static com.vti.utils.ScannerUtils.inputString;

public class Student {
    private static int counter = 0;

    private int id;
    private String name;

    public Student(){
        inputStudent();
    }

    public Student(String name) {
        this.id = ++counter;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void inputStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào tên Student: ");
        this.name = inputString(scanner, "Vui lòng nhập đúng định dạng String cho tên Student!!!");
        this.id = ++counter;
    }

    @Override
    public void finalize(){
        System.out.println("Hello world");
    }
}
