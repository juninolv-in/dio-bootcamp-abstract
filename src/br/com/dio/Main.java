package br.com.dio;

import br.com.dio.domain.Bootcamp;
import br.com.dio.domain.Course;
import br.com.dio.domain.Developer;
import br.com.dio.domain.Mentoring;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("QA 2");
        course1.setDescription("Quality Assurance");
        course1.setWorkload(72);

        Course course2 = new Course();
        course2.setTitle("DS 4");
        course2.setDescription("Software Development");
        course2.setWorkload(64);

        Mentoring mentoring1 = new Mentoring();
        mentoring1.setTitle("QA 2");
        mentoring1.setDescription("Test Smoke");
        mentoring1.setDate(LocalDate.of(2024, 6, 22));

        Mentoring mentoring2 = new Mentoring();
        mentoring2.setTitle("DS 4");
        mentoring2.setDescription("Javascript");
        mentoring2.setDate(LocalDate.of(2024, 6, 30));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Santander Bootcamp 2024");
        bootcamp.setDescription("Good Bootcamp <3");
        bootcamp.getContents().addAll(Set.of(course1, course2, mentoring1, mentoring2));

        Developer developer1 = new Developer();
        developer1.setName("Juninho Oliveira");
        developer1.subscribe(bootcamp);

        Developer developer2 = new Developer();
        developer2.setName("Erik Fernandes");
        developer2.subscribe(bootcamp);

        System.out.println(bootcamp);

        developer1.toProgress();
        developer1.toProgress();
        developer1.toProgress();
        developer1.toProgress();

        System.out.println(developer1.calcTotalXp());
        System.out.println(developer1.getSubscribers().size());

        developer2.toProgress();
        developer2.toProgress();
        developer2.toProgress();

        System.out.println(developer2.calcTotalXp());
        System.out.println(developer2.getSubscribers().size());
    }
}