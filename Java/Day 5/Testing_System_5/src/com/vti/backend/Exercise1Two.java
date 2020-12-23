package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.abstraction.question2.TuyenSinh;

public class Exercise1Two {
	public void questionTwo() {
		TuyenSinh tuyenSinh = new TuyenSinh();
		Scanner scanner = new Scanner(System.in);
		
		int choose;
		
		do {
			loadMenu();
			choose = scanner.nextInt();
			switch(choose) {
			case 1:
				tuyenSinh.add();
				break;
				case 2:
					tuyenSinh.display();
				case 3:
					tuyenSinh.search();
					tuyenSinh.display();
				case 4: System.out.println("bye");
				break;
			}
		} while (choose != 4);
		scanner.close();
		
	}
	
	public void loadMenu() {
		System.out.println("------------------------");
		System.out.println("1 Thêm thí sinh ");
		System.out.println("2 Hiển thị thông tin...");
		System.out.println("3 Tìm kiếm theo SBD ");
		System.out.println("4 Thoát		");
		System.out.println("-------------------------");
	}

}
