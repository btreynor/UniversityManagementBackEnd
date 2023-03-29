package com.btreynor.spgolf.exception;

public class UniversityNotFoundException extends RuntimeException {
    public UniversityNotFoundException(Long id) {
        super("Could not find University with this id: " + id);
    }
}
