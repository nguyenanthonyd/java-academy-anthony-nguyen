package com.pluralsight;
import java.util.ArrayList;


public class Cat {
    public String name;

    private ArrayList<Cat> allcats;
    private Cat c1;

    public Cat(String catName) {
        allCats = new ArrayList<>();
        c1 = new Cat();
        c1.name = "MeowMeow";
        allCats.add(c1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Cat> getAllcats() {
        return allcats;
    }

    public void setAllcats(ArrayList<Cat> allcats) {
        this.allcats = allcats;
    }

    public Cat getC1() {
        return c1;
    }

    public void setC1(Cat c1) {
        this.c1 = c1;
    }

    public ArrayList<Cat> getAllCats() {
        return allCats;
    }

    public void setAllCats(ArrayList<Cat> allCats) {
        this.allCats = allCats;
    }

    ArrayList<Cat> allCats = new
            ArrayList<>();
    Cat c1 = new Cat();
    c1.name ="MeowMeow";
    allCats.add(c1);

}

    // Getters and Setters



