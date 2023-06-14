package personal.boardPractice2.article.articlecontroller;

import personal.boardPractice2.article.entity.Article;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticleController {
    int id = 1;
    Scanner sc = new Scanner(System.in);
    List<Article> articles = new ArrayList<>();

    public String formattedDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        return formattedDate;
    }

    public void addTestData() {
        Article article1 = new Article("안녕하세요 반갑습니다. 자바 공부중이에요.", "첫 번째 게시물 내용입니다.", id);
        article1.setRegistrationDate(formattedDate());
        articles.add(article1);
        id++;

        Article article2 = new Article("자바 질문좀 할게요~", "두번째 내용입니다.", id);
        article1.setRegistrationDate(formattedDate());
        articles.add(article2);
        id++;

        Article article3 = new Article("정처기 따야되나요?", "세번째 내용입니다.", id);
        article1.setRegistrationDate(formattedDate());
        articles.add(article3);
        id++;
    }

    public Article findArticleById(int index) {
        for (Article article : articles) {
            if (article.getIds() == index) {
                return article;
            }
        }
        return null;
    }

    public void add() {
        System.out.print("게시물 제목을 입력해 주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해 주세요 : ");
        String content = sc.nextLine();

        Article article = new Article(title, content, id);
        article.setRegistrationDate(formattedDate());
        articles.add(article);
        System.out.println("게시물이 등록되었습니다.");
    }

    public void list() {
        if (articles.isEmpty()) {
            System.out.println("등록된 게시물이 없습니다.");
        } else {
            System.out.println("==================");
            for (Article atricle : articles) {
                System.out.println("번호 : " + atricle.getIds());
                System.out.println("제목 : " + atricle.getTitles());
                System.out.println("==================");
            }
        }
    }

    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int index = Integer.parseInt(sc.nextLine());

        Article article = findArticleById(index);

        if (article == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            System.out.print("제목 : ");
            String newTitle = sc.nextLine();
            System.out.print("내용 : ");
            String newContent = sc.nextLine();

            article.setTitles(newTitle);
            article.setContents(newContent);
            article.setRegistrationDate(formattedDate());

            System.out.println(index + "번 게시물이 수정되었습니다.");
        }
    }

    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int index = Integer.parseInt(sc.nextLine());

        Article article = findArticleById(index);

        if (article == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            articles.remove(article);
            System.out.println(index + "번 게시물이 삭제되었습니다.");
        }

    }

    public void detail() {
        System.out.print("상세보기할 게시물 번호 : ");
        int index = Integer.parseInt(sc.nextLine());

        Article article = findArticleById(index);

        if (article == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            System.out.println("==================");
            System.out.println("번호 : " + article.getIds());
            System.out.println("제목 : " + article.getTitles());
            System.out.println("내용 : " + article.getContents());
            System.out.println("등록날짜 : " + article.getRegistrationDate());

            article.setCountOfView(article.getCountOfView() + 1);
            System.out.println("조회수 : " + article.getRegistrationDate());
            System.out.println("==================");
        }
    }

    public void search() {
        System.out.print("검색 키워드를 입력해주세요 : ");
        String keyword = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < articles.size(); i++) {
            Article article = articles.get(i);
            if (article.getTitles().contains(keyword)) {
                System.out.println("=============");
                System.out.println("번호 : " + article.getIds());
                System.out.println("제목 : " + article.getTitles());
                System.out.println("=============");
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }
}
