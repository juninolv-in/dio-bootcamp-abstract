package br.com.dio;

import br.com.dio.entity.Course;
import br.com.dio.entity.Mentoring;

import java.time.LocalDate;

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



    }
}