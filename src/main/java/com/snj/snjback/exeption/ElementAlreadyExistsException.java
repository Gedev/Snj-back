package com.snj.snjback.exeption;

public class ElementAlreadyExistsException extends RuntimeException {
    public ElementAlreadyExistsException(String element) {
        super(element + " is already exist");
    }
}