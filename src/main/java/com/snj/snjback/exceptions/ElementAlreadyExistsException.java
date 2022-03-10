package com.snj.snjback.exceptions;

public class ElementAlreadyExistsException extends RuntimeException{
    public ElementAlreadyExistsException() {
        super("Cet element existe déjà!");
    }
}
