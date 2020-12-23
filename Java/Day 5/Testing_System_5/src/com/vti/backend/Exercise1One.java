package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.abstraction.question1.News;

public class Exercise1One {

	public void questionOne() {
		
		News news = new News();

		Scanner scanner = new Scanner(System.in);

		int choose = 0;
		do {
			loadMenu();
			choose = scanner.nextInt();

			switch (choose) {
			case 1:
				news.insertNews();
				break;
			case 2:
				news.display();
				break;
			case 3:
				news.calculate();
				news.display();
				break;
			case 4:
				System.out.println("Thoát !");
				break;

			default:
				break;
			}
		} while (choose != 4);

		scanner.close();
	}

	public static void loadMenu() {
		System.out.println("------------------");
		System.out.println("1 - Insert view   ");
		System.out.println("2 - View list news");
		System.out.println("3 - Average rate  ");
		System.out.println("4 - Exit		  ");
		System.out.println("------------------");
	}

}
