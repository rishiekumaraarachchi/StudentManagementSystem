package com.example.sbrdemo.exeption;

public class StudentAlreadyExistsExeption extends RuntimeException {
    public StudentAlreadyExistsExeption(String message) {
        super(message);
    }
}
