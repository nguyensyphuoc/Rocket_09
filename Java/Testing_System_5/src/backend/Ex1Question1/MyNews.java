package backend.Ex1Question1;

import entity.Exercise1.Question1.News;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyNews {
    private List<News> newsList;
    Scanner scanner;

    public MyNews(){
        newsList = new ArrayList<>();
    }

    public void insertNews(){
        News news = new News();
        int[] rates = new int[3];
        scanner = new Scanner(System.in);

        System.out.println("Nhập Title: ");
        news.setTitle(scanner.nextLine());

        System.out.println("Nhập Publish Date: ");
        news.setPublishDate(scanner.nextLine());

        System.out.println("Nhập Author: ");
        news.setAuthor(scanner.nextLine());

        System.out.println("Nhập Content: ");
        news.setContent(scanner.nextLine());

        System.out.println("Nhập 3 đánh giá!");
        for (int i = 0; i < 3; i++){
            System.out.println("Đánh giá " + (i + 1) + ": ");
            rates[i] = scanner.nextInt();
        }

        news.setRates(rates);
        newsList.add(news);
    }

    public void DisplayNews(){
        for (News news: newsList) {
            news.Display();
        }
    }

    public void averageRate(){
        for (News news: newsList) {
            System.out.println("Title: " + news.getTitle() + "/ Average Rate: " + news.Calculate());
        }
    }
}
