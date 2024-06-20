package br.com.dio.domain;

public class Course extends Content {
    private int workload;

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public double calcXp() {
        return XP * workload;
    }

    @Override
    public String toString() {
        return String.format(
            "Course{title='%s', description='%s', workload='%s'}",
            getTitle(), getDescription(), getWorkload()
        );
    }
}
