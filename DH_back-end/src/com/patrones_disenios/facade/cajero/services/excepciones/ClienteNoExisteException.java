package com.patrones_disenios.facade.cajero.services.excepciones;

public class ClienteNoExisteException extends RuntimeException{
    public ClienteNoExisteException(String message) {
        super(message);
    }
}
