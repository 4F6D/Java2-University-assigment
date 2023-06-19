package com.example.java_2_university_assignment;

public abstract class Hero {
    // Klassenattribute
    protected int health;
    protected String name;

    // Konstruktoren
    Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Setter
    public void setHealth(int health) {
        // Health darf nicht negativ sein
        if(health < 0) { health = health *-1; }
        this.health = health;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    // Klassenmethoden
    public void attack(Fiend targetFiend) {

    }
}
