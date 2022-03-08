package com.snj.snjback.exceptions;

public class ElementAlreadyExistException extends RuntimeException{
    public ElementAlreadyExistException() {
        super("Cet element existe déjà!");
    }
}
