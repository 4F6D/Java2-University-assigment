package com.example.java_2_university_assignment;

public abstract class Fiend {
    // Klassenattribute
    protected int health;

    // Konstruktoren
    Fiend(int health) {
        this.health = health;
    }

    // Klassenmethoden
    public void attack(Hero targetHero) {

    }

    // Setter
    public void setHealth(int health) {
        // Health darf nicht negativ sein
        if(health < 0) { health = health *-1; }
        this.health = health;
    }
}
