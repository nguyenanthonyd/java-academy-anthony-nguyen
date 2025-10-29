package com.pluralsight;

public class Sceptile extends Pokemon {
    public Sceptile(String name) {
            super(name);
        }

        @Override
        public String attack() {
            System.out.println("Sceptile used Leaf Blade!");
            return "";
        }
    }

