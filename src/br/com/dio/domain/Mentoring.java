package br.com.dio.domain;

import java.time.LocalDate;

public class Mentoring extends Content {
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calcXp() {
        return XP + 20;
    }

    @Override
    public String toString() {
        return String.format(
            "Mentoring{title='%s', description='%s', date='%s'}",
            getTitle(), getDescription(), getDate()
        );
    }
}
