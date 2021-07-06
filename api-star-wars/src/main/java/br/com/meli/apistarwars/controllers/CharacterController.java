package br.com.meli.apistarwars.controllers;

import br.com.meli.apistarwars.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CharacterController {
    @Autowired
    private CharacterService characterService;

    @GetMapping("/character/{name}")
    public List<String> findCharacterByName(@PathVariable String name) {
        return characterService.findCharacterByName(name);
    }
}
