package com.vti.backend;

import com.vti.entity.polymorphism.question1.Student;

public class Exercise2One {
	private Student[] students;
	
	public Exercise2One() {
		students = new Student[11];
	}
	
	public void addStudent() {
		students[1] = new Student(1, 1, "Ronaldo");
		students[2] = new Student(2, 1, "Messi");
		students[3] = new Student(3, 1, "Neymar");
		students[4] = new Student(4, 2, "Pogba");
		students[5] = new Student(5, 2, "Ramos");
		students[6] = new Student(6, 2, "Salah");
		students[7] = new Student(7, 3, "Bruno");
		students[8] = new Student(8, 3, "A");
		students[9] = new Student(9, 3, "B");
		students[10] = new Student(10, 3, "C");
	}
	
	public void caLopDiemDanh() {
		for (int i = 1; i <= 10; i++) {
			students[i].diemDanh();
		}
	}

	public void nhomDiHocBai() {
		for (int i = 1; i <= 10; i++) {
			if (students[i].getGroup() == 1) {
				students[i].hocBai();
			}
		}
	}

	public void nhomDiDonVeSinh() {
		for (int i = 1; i <= 10; i++) {
			if (students[i].getGroup() == 2) {
				students[i].diDonVeSinh();
			}
		}
	}
	
	public void loadMenu() {
		System.out.println("------------------");
		System.out.println("1 - Cả lớp điểm danh   ");
		System.out.println("2 - Nhóm 1 đi học bài");
		System.out.println("3 - Nhóm 2 đi dọn vệ sinh  ");
		System.out.println("4 - Exit		  ");
		System.out.println("------------------");
	}

}
