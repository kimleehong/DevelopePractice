package personal.boardPractice.article.articlecontroller;

import personal.boardPractice.article.entity.Articles;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticleController {
    Scanner sc = new Scanner(System.in);
    List<Articles> articles = new ArrayList<>();
    int no = 1;

    public void add() {
        System.out.print("게시물 제목을 입력해 주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해 주세요 : ");
        String content = sc.nextLine();

        Articles article = new Articles(no, title, content);
        article.setRegistrationDates(fomattedNow());
        articles.add(article);
        no++;

        System.out.println("게시물이 등록되었습니다.");
    }

    public void list() {
        if (articles.isEmpty()) {
            System.out.println("등록된 게시물이 없습니다.");
        } else {
            System.out.println("==================");
            for (Articles article : articles) {
                System.out.println("번호: " + article.getIds());
                System.out.println("제목: " + article.getTitles());
                System.out.println("=================");
            }
        }
    }

    public Articles findArticleById(int index) {
        for (Articles article : articles) {
            if (article.getIds() == index) {
                return article;
            }
        }
        return null;
    }

    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int index = Integer.parseInt(sc.nextLine());

        Articles article = findArticleById(index);

        if (article == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            System.out.print("제목 : ");
            String newTitle = sc.nextLine();
            System.out.print("내용 : ");
            String newContent = sc.nextLine();

            article.setTitles(newTitle);
            article.setContents(newContent);
            article.setRegistrationDates(fomattedNow());

            System.out.println(index + "번 게시물이 수정되었습니다.");
        }
    }

    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int index = Integer.parseInt(sc.nextLine());

        Articles article = findArticleById(index);

        if (article == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            articles.remove(article);

            System.out.println(index + "번 게시물이 삭제되었습니다.");
        }
    }

    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
        int index = Integer.parseInt(sc.nextLine());

        Articles article = findArticleById(index);

        if (article == null) {
            System.out.println("존재하지 않는 게시물 번호입니다.");
        } else {
            System.out.println("==================");
            System.out.println("번호 : " + article.getIds());
            System.out.println("제목 : " + article.getTitles());
            System.out.println("내용 : " + article.getContents());
            System.out.println("등록날짜 : " + article.getRegistrationDates());
            article.setCountOfView(article.getCountOfView() + 1);
            System.out.println("조회수  : " + article.getCountOfView());
            System.out.println("==================");
        }
    }

    public void search() {
        System.out.print("검색 키워드를 입력해 주세요 : ");
        String keyword = sc.nextLine();

        List<Articles> searchResult = new ArrayList<>();

        for (Articles article : articles) {
            if (article.getTitles().contains(keyword)) {
                searchResult.add(article);
            }
        }

        if (searchResult.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            for (Articles article : searchResult) {
                System.out.println("==================");
                System.out.println("번호 : " + article.getIds());
                System.out.println("제목 : " + article.getTitles());
                System.out.println("==================");
            }
        }
    }

    public void addTestData() {

        Articles article1 = new Articles(no, "안녕하세요 반갑습니다. 자바 공부중이에요.", "첫 번째 게시물 내용입니다.");
        article1.setRegistrationDates(fomattedNow());
        articles.add(article1);
        no++;

        Articles article2 = new Articles(no, "자바 질문좀 할게요~", "두 번째 게시물 내용입니다.");
        article2.setRegistrationDates(fomattedNow());
        articles.add(article2);
        no++;

        Articles article3 = new Articles(no, "정처기 따야되나요?", "세 번째 게시물 내용입니다.");
        article3.setRegistrationDates(fomattedNow());
        articles.add(article3);
        no++;

    }

    public String fomattedNow() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        return formattedDateTime;
    }
}
