package br.com.dio.entity;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate endDate = startDate.plusDays(45);
    private final Set<Content> contents = new LinkedHashSet<>();
    private final Set<Developer> developers = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public Set<Developer> getDevelopers() {
        return developers;
    }

    @Override
    public String toString() {
        return String.format(
            "Bootcamp{name='%s', description='%s', startDate='%s', endDate='%s', contents='%s', developers='%s'}",
            getName(), getDescription(), getStartDate(), getEndDate(), getContents(), getDevelopers()
        );
    }
}
