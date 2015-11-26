package com.example.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class LigaException extends RuntimeException {
    public LigaException(Long id) {
        super("No existe la liga con id: " + id);
    }
}