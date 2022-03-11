package com.snj.snjback.exeption;

public class ElementNotFoundException extends RuntimeException{

    public ElementNotFoundException(String message) {
        super(message+ " n'a pas été trouvé");
    }
}
