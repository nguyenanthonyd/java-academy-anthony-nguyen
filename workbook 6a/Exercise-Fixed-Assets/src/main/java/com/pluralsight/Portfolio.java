package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private final List<Valuable> valuables = new ArrayList<>();


    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable value) {
        valuables.add(value);
    }
    public double getValue() {
        double total = 0.0;
        for (Valuable value : valuables) {
            total += value.getValue();
        }
        return total;
    }
    }