package com.snj.snjback.exeption;

public class ElementNotFoundException extends RuntimeException{

    public ElementNotFoundException() {
        super(" wasn't found");
    }
}
