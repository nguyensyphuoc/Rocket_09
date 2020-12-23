package com.vti.entity.abstraction.question2;

import java.util.ArrayList;

import java.util.Scanner;


public class TuyenSinh implements ITuyenSinh {
	private Scanner scanner;

	private ArrayList<thiSinh> thiSinhs;

	public TuyenSinh() {
		thiSinhs = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Nhập số thí sinh muốn thêm: ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			thiSinh thiSinh1 = new thiSinh();
			thiSinh1.nhap();
			thiSinhs.add(thiSinh1);
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for (thiSinh thiSinh1 : thiSinhs) {
			System.out.println(thiSinh1);
		}
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("Nhập số báo danh cần tìm: ");
		String sbd = scanner.nextLine();
		for (thiSinh thiSinh1 : thiSinhs) {
			System.out.println(thiSinh1);
		}

	}

}
