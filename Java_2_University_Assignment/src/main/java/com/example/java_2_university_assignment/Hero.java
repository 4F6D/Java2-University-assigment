package com.example.java_2_university_assignment;

public class Hero {
    // Klassenattribute
    protected int health;
    protected String name;

    // Konstruktoren
    Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Setter

    // Getter
    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }
}
