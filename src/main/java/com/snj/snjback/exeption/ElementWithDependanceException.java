package com.snj.snjback.exeption;

public class ElementWithDependanceException extends RuntimeException{
    public ElementWithDependanceException(String message) {
        super(message+ " ne peut pas être supprimer car il n'est pas vide");
    }
}
