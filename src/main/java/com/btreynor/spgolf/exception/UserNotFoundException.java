package com.btreynor.spgolf.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Could not find User with this id: " + id);
    }
}
