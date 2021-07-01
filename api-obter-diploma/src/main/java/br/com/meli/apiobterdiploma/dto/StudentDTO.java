package br.com.meli.apiobterdiploma.dto;

import java.util.List;

public class StudentDTO {
    private String name;
    private List<SubjectDTO> subjects;

    public StudentDTO(String name, List<SubjectDTO> subjectList) {
        this.name = name;
        this.subjects = subjectList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubjectDTO> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectDTO> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
