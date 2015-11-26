package com.example.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TemporadaException extends RuntimeException {
    public TemporadaException(Long id) {
        super("No existe la temporada con id: " + id);
    }
}