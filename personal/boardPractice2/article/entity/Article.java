package personal.boardPractice2.article.entity;

public class Article {
    private String titles;
    private String contents;
    private int ids;
    private String registrationDate;
    private int countOfView;

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setCountOfView(int countOfView) {
        this.countOfView = countOfView;
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

    public String getRegistrationDate() {
        return registrationDate;
    }

    public int getCountOfView() {
        return countOfView;
    }

    public Article(String titles, String contents, int ids) {
        this.titles = titles;
        this.contents = contents;
        this.ids = ids;
        this.registrationDate = null;
        this.countOfView = 0;
    }


}
