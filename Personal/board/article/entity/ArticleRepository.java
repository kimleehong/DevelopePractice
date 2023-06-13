package Personal.board.article.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {
    List<Article> articles = new ArrayList<>();
    int no = 1;

    public ArticleRepository() {
        addDefaultPosts();
    }

    public void insert(String title, String body) {
        Article article = new Article(no, title, body);
        LocalDateTime now = LocalDateTime.now();
        article.setRegistrationDate(now);
        articles.add(article);
        no++;
    }

    public List<Article> getArticleList() {
        return articles;
    }

    public void addDefaultPosts() {
        LocalDateTime now = LocalDateTime.now();

        Article[] defaultArticles = {
                new Article(no++, "안녕하세요 반갑습니다. 자바 공부중이에요.", "첫번째 게시물 내용입니다."),
                new Article(no++, "자바 질문좀 할게요~", "두번째 게시물 내용입니다."),
                new Article(no++, "정처기 따야되나요?", "세번째 게시물 내용입니다.")
        };

        for (Article article : defaultArticles) {
            article.setRegistrationDate(now);
            articles.add(article);
        }

        System.out.println("기본 게시물이 등록되었습니다.");
    }

    public Article findArticleById(int index) {
        for (Article article : articles) {
            if (article.getNo() == index) {
                return article;
            }
        }
        return null;
    }

    public void printArticles(List<Article> articles) {
        System.out.println("=================");
        for (Article article : articles) {
            System.out.println("번호: " + article.getNo());
            System.out.println("제목: " + article.getTitle());
            System.out.println("=================");
        }
    }

    public void delete(Article article) {
        articles.remove(article);
    }

    public void update(Article article, String newTitle, String newBody) {
        article.setTitle(newTitle);
        article.setBody(newBody);
    }

    public void viewer(Article article) {
        System.out.println("==================");
        System.out.println("번호: " + article.getNo());
        System.out.println("제목: " + article.getTitle());
        System.out.println("내용: " + article.getBody());
        System.out.println("조회수: " + article.getCountOfView());
        System.out.println("등록날짜: " + article.getRegistrationDate().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
        System.out.println("==================");

        article.setCountOfView(article.getCountOfView() + 1);
    }
}
