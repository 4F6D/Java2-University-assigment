package com.example.java_2_university_assignment;

public class HeroCreator {
    public static Hero[] createHeroes() {
        Hero[] heros = new Hero[3];

        heros[0] = new Paladin("Rene", 100);
        heros[1] = new Knight("Tricia", 80);
        heros[2] = new Mage("Tarek", 40);

        return heros;
    }
}
