package br.com.meli.apistarwars.exceptions;

public class IOException extends RuntimeException {
    public IOException() {
        super("Input and Output error");
    }
}
