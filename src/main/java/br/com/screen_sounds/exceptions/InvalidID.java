package br.com.screen_sounds.exceptions;

public class InvalidID extends RuntimeException{
    public InvalidID(String message) {
        super(message);
    }

    public InvalidID(String message, Throwable cause) {
        super(message, cause);
    }
}
