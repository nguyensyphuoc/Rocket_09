package com.vti.entity.polymorphism.question1;

public class Student implements IStudent{
	
	private int id;
	

	private String name;
	private int group;
	
	public Student(int id, int group, String name) {
		this.id = id;
		this.name = name;
		this.group = group;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGroup() {
		return group;
	}

	@Override
	public void diemDanh() {
		// TODO Auto-generated method stub
		System.out.println(name + " Đang điểm danh ...");
	}

	@Override
	public void hocBai() {
		// TODO Auto-generated method stub
		System.out.println(name + " Đang học bài ...");
	}

	@Override
	public void diDonVeSinh() {
		// TODO Auto-generated method stub
		System.out.println(name + " Đang dọn vệ sinh ....");
	}	
	
}
