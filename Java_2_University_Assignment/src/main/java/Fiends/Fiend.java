package Fiends;

import Game.GameObject;
import Hero.Hero;

public abstract class Fiend extends GameObject {
    // Klassenattribute
    protected int health;

    // Konstruktoren
    Fiend(int health) {
        this.health = health;
    }

    // Setter
    public void setHealth(int health) {
        // Health darf nicht negativ sein
        if(health < 0) { health = health *-1; }
        this.health = health;
    }

    // Getter
    public int getHealth() {
        return this.health;
    }
}
