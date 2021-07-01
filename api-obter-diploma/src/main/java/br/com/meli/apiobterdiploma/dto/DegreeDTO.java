package br.com.meli.apiobterdiploma.dto;

public class DegreeDTO {
    private String message;
    private double average;
    private String student;

    public DegreeDTO(String message, double average, String student) {
        this.message = message;
        this.average = average;
        this.student = student;
    }

    public String getMessage() {
        return message;
    }

    public double getAverage() {
        return average;
    }

    public String getStudent() {
        return student;
    }
}
