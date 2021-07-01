package br.com.meli.apiobterdiploma.dao;

import br.com.meli.apiobterdiploma.dto.StudentDTO;
import br.com.meli.apiobterdiploma.dto.SubjectDTO;

public class StudentDAO {
    public double calculateGradesAverage(StudentDTO student) {
        double gradesSum = student.getSubjects().stream().mapToDouble(SubjectDTO::getGrade).sum();
        return gradesSum / student.getSubjects().size();
    }
}
