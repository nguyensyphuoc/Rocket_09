package com.vti.entity.abstraction.question2;

import java.util.Scanner;

public class thiSinh {
	private String sbd;
	private String name;
	private String diaChi;
	private byte mucUuTien;
	private KhoiThi khoiThi;

	public String getName() {
		return name;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public byte getMucUuTien() {
		return mucUuTien;
	}

	public KhoiThi getKhoiThi() {
		return khoiThi;
	}

	public String getSbd() {
		return sbd;
	}

	public void nhap() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số báo danh: ");
		sbd = scanner.nextLine();

		System.out.println("Nhập tên thí sinh: ");
		name = scanner.nextLine();

		System.out.println("Nhập địa chỉ thí sinh: ");
		diaChi = scanner.nextLine();

		System.out.println("Nhập mức ưu tiên: ");
		mucUuTien = scanner.nextByte();

		System.out.println("Nhập khối thi: ");
		khoiThi = new KhoiThi();
		khoiThi.setKhoiName(scanner.nextLine());
		scanner.close();
	}

	public String DisplayIF() {
		return "Thí Sinh: " + name + "\n" + "Số báo danh: " + sbd + "\n" + "Địa chỉ: " + diaChi + "\n" + "Mức ưu tiên: "
				+ mucUuTien + "\n" + "Khối thi: " + khoiThi.getMonThi() + "\n";
	}
}
