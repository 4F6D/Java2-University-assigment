package com.example.java_2_university_assignment;

public class SpawnEngine {
    // Klassenattribute

    // Konstruktoren
    public SpawnEngine() {

    }

    // Klassenmethoden
    public Fiend spawn() {
        return new Spider(10);
    }
}
