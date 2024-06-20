package br.com.dio.domain;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Developer {
    private String name;
    private final Set<Content> subscribers = new LinkedHashSet<>();
    private final Set<Content> completed = new LinkedHashSet<>();

    public void subscribe(Bootcamp bootcamp) {
        subscribers.addAll(bootcamp.getContents());
        bootcamp.getDevelopers().add(this);
    }

    public void toProgress() {
        Optional<Content> first = subscribers.stream().findFirst();

        if (first.isPresent()) {
            completed.add(first.get());
            subscribers.remove(first.get());
        } else {
            System.err.println("No subscribed content");
        }
    }

    public double calcTotalXp() {
        return completed.stream().mapToDouble(Content::calcXp).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribers() {
        return subscribers;
    }

    public Set<Content> getCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return String.format(
            "Developer{name='%s', subscribers='%s', completed='%s'}",
            getName(), getSubscribers(), getCompleted()
        );
    }
}
