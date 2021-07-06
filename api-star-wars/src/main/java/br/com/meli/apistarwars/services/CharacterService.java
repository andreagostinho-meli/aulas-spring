package br.com.meli.apistarwars.services;

import br.com.meli.apistarwars.dto.CharacterDTO;
import br.com.meli.apistarwars.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Service
public class CharacterService {
    @Autowired
    private CharacterRepository characterRepository;

    public List<String> findCharacterByName(String name) {
        List<CharacterDTO> characterList = characterRepository.findAll();
        List<String> filteredCharacters = new ArrayList<>();

        for(CharacterDTO character : characterList) {
            Boolean containsName = Arrays.asList(character.getName().toLowerCase()
                                    .split(" "))
                                    .contains(name.toLowerCase());

            if(containsName) filteredCharacters.add(character.getName());
        }

        return filteredCharacters;
    }
}
