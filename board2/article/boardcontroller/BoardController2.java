package board2.article.boardcontroller;

import board.article.entity.Article;
import board2.article.entity.Article2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardController2 {
    List<Article2> articles2 = new ArrayList<>();
    int no = 1;
    Scanner sc = new Scanner(System.in);

    public void addDefaultPosts() {
        LocalDateTime now = LocalDateTime.now();

        Article2[] defaultArticles = {
                new Article2(no++, "안녕하세요 반갑습니다. 자바 공부중이에요.", "첫번째 게시물 내용입니다."),
                new Article2(no++, "자바 질문좀 할게요~", "두번째 게시물 내용입니다."),
                new Article2(no++, "정처기 따야되나요?", "세번째 게시물 내용입니다.")
        };

        for (Article2 article : defaultArticles) {
            article.setRegistrationDate(now);
            articles2.add(article);
        }
        System.out.println("기본 게시물이 등록되었습니다.");
    }

    public void addPost() {
        System.out.print("게시물 제목을 입력해주세요: ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요: ");
        String body = sc.nextLine();

        LocalDateTime now = LocalDateTime.now();

        Article2 article2 = new Article2(no, title, body);
        article2.setRegistrationDate(now);
        articles2.add(article2);
        no++;

        System.out.println("게시물이 등록되었습니다.");
    }

    public void listPost() {
        if (articles2.isEmpty()) {
            System.out.println("등록된 게시물이 없습니다.");
        } else {
            System.out.println("=================");
            for (Article2 article : articles2) {
                System.out.println("번호: " + article.getNo());
                System.out.println("제목: " + article.getTitle());
                System.out.println("=================");
            }
        }
    }

    public Article2 targetIndex(int index) {
        for (Article2 article : articles2) {
            if (article.getNo() == index) {
                return article;
            }
        }
        return null;
    }

    public void deletePost() {
        System.out.print("삭제할 게시물 번호 : ");
        int index = Integer.parseInt(sc.nextLine());

        Article2 article2 = targetIndex(index);

        if (article2 == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            articles2.remove(article2);
            System.out.println(index + "번 게시물이 삭제되었습니다.");
        }
    }

    public void updatePost(){
        System.out.print("수정할 게시물 번호: ");
        int index = Integer.parseInt(sc.nextLine());

        Article2 article2 = targetIndex(index);

        if (article2 == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            System.out.print("새로운 제목: ");
            String newTitle = sc.nextLine();
            System.out.print("새로운 내용: ");
            String newBody = sc.nextLine();

            article2.setTitle(newTitle);
            article2.setBody(newBody);

            System.out.println(index + "번 게시물이 수정되었습니다.");
        }
    }

    public void detailPost(){
        System.out.print("상세보기 할 게시물 번호를 입력해주세요: ");
        int index = Integer.parseInt(sc.nextLine());
        Article2 article2 = targetIndex(index);

        if (article2 == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            System.out.println("==================");
            System.out.println("번호: " + article2.getNo());
            System.out.println("제목: " + article2.getTitle());
            System.out.println("내용: " + article2.getBody());
            System.out.println("조회수: " + article2.getCountOfView());
            System.out.println("등록날짜: " + article2.getRegistrationDate().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
            System.out.println("==================");

            article2.setCountOfView(article2.getCountOfView() + 1);
        }
    }

    public void searchPost(){
        System.out.print("검색할 키워드를 입력해주세요: ");
        String keyword = sc.nextLine();

        List<Article2> searchResults = new ArrayList<>();

        for (Article2 article : articles2) {
            if (article.getTitle().contains(keyword)) {
                searchResults.add(article);
            }
        }

        if (searchResults.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            System.out.println("==================");
            for (Article2 article : searchResults) {
                System.out.println("번호: " + article.getNo());
                System.out.println("제목: " + article.getTitle());
                System.out.println("==================");
            }
        }


    }



}
