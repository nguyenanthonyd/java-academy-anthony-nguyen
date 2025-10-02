package com.pluralsight;

import java.util.logging.SocketHandler;

public class PowerpuffGirl {

    private String name;
    private int health;
    private String outfitcolor;
    private int attackDamage;
    private int power;

    //Constructor (parameters with a _name)
    public PowerpuffGirl(String _name, String _outfitcolor) {
        this.name = _name;
        this.outfitcolor = _outfitcolor;
        this.power = 100; // default values
        this.health = 100; // default values
        this.attackDamage = 100; // default values
    }
    public String getName() {
        return this.name;
    }


    public int getHealth() {
        return this.health;
    }

    public void setHealth(int _newHealth ) {
        if(_newHealth > 0 && _newHealth < 100)
        {
            this.health = _newHealth;
        }
        System.out.println("Come on, this is not possible");
    }
    public void Heal(int _howMuchHealth) {

    }
}