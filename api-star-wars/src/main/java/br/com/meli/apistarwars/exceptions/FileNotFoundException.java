package br.com.meli.apistarwars.exceptions;

public class FileNotFoundException extends RuntimeException {
    public FileNotFoundException() {
        super("File not found");
    }
}
