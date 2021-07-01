package br.com.meli.apiobterdiploma.controllers;

import br.com.meli.apiobterdiploma.dao.StudentDAO;
import br.com.meli.apiobterdiploma.dto.DegreeDTO;
import br.com.meli.apiobterdiploma.dto.StudentDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DegreeController {
    @PostMapping("/degree")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public DegreeDTO generateDegree(@RequestBody StudentDTO student) {
        double gradesAverage = new StudentDAO().calculateGradesAverage(student);

        String message = (gradesAverage > 9)
                        ? "Parabéns, você foi aprovado(a)!"
                        : "Você foi reprovado(a), se esforce mais da próxima vez!";

        return new DegreeDTO(message, gradesAverage, student.getName());
    }
}
