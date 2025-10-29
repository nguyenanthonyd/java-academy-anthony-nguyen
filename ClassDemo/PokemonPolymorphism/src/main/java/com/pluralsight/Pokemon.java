package com.pluralsight;

public abstract class Pokemon {

    private String energyType;
    private String name;

    public Pokemon(String name) {
        this.name = name;
    }

    public String getEnergyType() {
        return energyType;
    }

    public Pokemon setEnergyType(String energyType) {
        this.energyType = energyType;
        return this;
    }

    public String getName() {
        return name;
    }

    public Pokemon setName(String name) {
        this.name = name;
        return this;
    }
public abstract String attack();
}

