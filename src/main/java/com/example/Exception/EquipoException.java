package com.example.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EquipoException extends RuntimeException {
    public EquipoException(Long id) {
        super("No existe el equipo con id: " + id);
    }
}