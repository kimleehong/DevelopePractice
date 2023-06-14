package personal.boardPractice.article.entity;

import java.util.Scanner;

public class Articles {
    private Scanner sc;
    private String titles;
    private String contents;
    private int ids;
    private String registrationDates;
    private int countOfView;

    public Articles(int ids, String titles, String contents) {
        this.titles = titles;
        this.contents = contents;
        this.ids = ids;
        registrationDates = null;
        countOfView = 0;
    }

    public String getTitles() {
        return titles;
    }

    public String getContents() {
        return contents;
    }

    public int getIds() {
        return ids;
    }

    public String getRegistrationDates() {
        return registrationDates;
    }

    public int getCountOfView() {
        return countOfView;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    public void setRegistrationDates(String registrationDates) {
        this.registrationDates = registrationDates;
    }

    public void setCountOfView(int countOfView) {
        this.countOfView = countOfView;
    }
}
