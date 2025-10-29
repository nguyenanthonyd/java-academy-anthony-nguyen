package com.pluralsight;

public class Mewtwo extends Pokemon {
    public Mewtwo(String name) {
        super(name);
    }

    @Override
    public String attack() {
        System.out.println("Mewtwo used Shadow Ball!");
        return "";
    }
}