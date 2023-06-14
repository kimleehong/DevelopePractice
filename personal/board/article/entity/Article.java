package personal.board.article.entity;

import java.time.LocalDateTime;

public class Article {
    private int no;
    private String title;
    private String body;
    private LocalDateTime registrationDate;
    private int countOfView;

    public Article() {
    }

    public Article(int no, String title, String body) {
        this.no = no;
        this.title = title;
        this.body = body;
        this.registrationDate = null;
        this.countOfView = 0;
    }

    public int getNo() {
        return no;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public int getCountOfView() {
        return countOfView;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setCountOfView(int countOfView) {
        this.countOfView = countOfView;
    }
}
