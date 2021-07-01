package br.com.meli.apiobterdiploma.dto;

public class SubjectDTO {
    private String name;
    private double grade;

    public SubjectDTO(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "SubjectDTO{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
