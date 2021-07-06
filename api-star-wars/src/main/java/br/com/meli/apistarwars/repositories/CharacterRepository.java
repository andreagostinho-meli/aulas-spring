package br.com.meli.apistarwars.repositories;

import br.com.meli.apistarwars.dto.CharacterDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Repository
public class CharacterRepository {
    public List<CharacterDTO> findAll() {
        return loadFile();
    }

    private List<CharacterDTO> loadFile() {
        File file = null;

        try {
            file = ResourceUtils.getFile("src/main/java/br/com/meli/apistarwars/starwars.json");
        } catch (FileNotFoundException e) {
            throw new br.com.meli.apistarwars.exceptions.FileNotFoundException();
        }

        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<CharacterDTO>> typeRef = new TypeReference<>() {};

        List<CharacterDTO> characterDTOS = null;

        try {
            FileInputStream is = new FileInputStream(file);
            characterDTOS = objectMapper.readValue(is, typeRef);
            is.close();
        } catch (IOException e) {
            System.out.println(e);
            throw new br.com.meli.apistarwars.exceptions.IOException();
        }

        return characterDTOS;
    }
}
