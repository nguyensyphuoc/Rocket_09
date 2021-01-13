package com.vti.frontend;

import com.vti.entity.Student;

import java.util.Date;

public class Program2 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Student s1 = new Student("Chinh xinh gai");

        s1 = null;

        System.gc();
        letma();
    }

    public static void letma(){
        int a;
        // xu ly ve a
    }
}
