package com.barbearia.barbearia.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ConflictingScheduleException extends RuntimeException{

    public ConflictingScheduleException(String message) {
        super(message);
    }
}
