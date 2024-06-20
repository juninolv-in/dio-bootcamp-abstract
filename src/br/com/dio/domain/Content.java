package br.com.dio.domain;

public abstract class Content {
    protected static final double  XP = 10;
    private String title;
    private String description;
    public abstract double calcXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
