package com.example.demo.exception_handler;

import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        log.error("MethodArgumentNotValidException has handled.", exception);
        return ResponseEntity.badRequest().body(exception.getBody());
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<Object> handleMethodArgumentNotValidException(MethodArgumentTypeMismatchException exception) {
        log.error("MethodArgumentTypeMismatchException has handled.", exception);
        return ResponseEntity.badRequest().body(exception.getMessage());
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Object> handleConstraintViolationException(ConstraintViolationException exception) {
        log.error("ConstraintViolationException has handled.", exception);
        return ResponseEntity.badRequest().body(exception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleHttpMessageNotReadableException(Exception exception) {
        log.error("Exception has handled.", exception);
        return ResponseEntity.internalServerError().body(exception.getMessage());
    }
}
