package br.com.meli.apicodigomorse.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/api")
public class TextController {
    @GetMapping("/morse/{text}")
    public String index(@PathVariable String text) {
        return translateMorse(text);
    }

    public String translateMorse(String text) {
        String[] morseCode = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };

        String[] array = text.split(" ");
        String translatedText = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < morseCode.length; j++) {
                if (array[i].compareTo(morseCode[j]) == 0) {
                    translatedText += (char)(j + 'a') + " ";
                    break;
                }
            }
        }

        return translatedText;
    }
}
