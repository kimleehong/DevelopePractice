package personal.bardPractice3.article.entity;

public class Entity {
    int ids;
    String titles;
    String contents;
    String registrationDates;
    int views;

    public Entity(int ids, String titles, String contents) {
        this.ids = ids;
        this.titles = titles;
        this.contents = contents;
        this.registrationDates = null;
        this.views = 0;
    }

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getRegistrationDates() {
        return registrationDates;
    }

    public void setRegistrationDates(String registrationDates) {
        this.registrationDates = registrationDates;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
