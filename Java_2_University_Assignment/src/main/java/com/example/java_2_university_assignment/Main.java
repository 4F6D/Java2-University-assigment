package com.example.java_2_university_assignment;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main {

    public static void main(String[] args) {

        // Helden generieren
        Hero[] heroes = new Hero[3];
        heroes[0] = new Knight("Rey", 20);
        heroes[1] = new Mage("Kaitlyn", 10);
        heroes[2] = new Paladin("Darren", 30);

        heroes[1].setHealth(-20);

        // Instanz von Arena anlegen
        Arena arena = new Arena(heroes);

        // Übersicht aller Helden ausgeben
        for(int i = 0; i < heroes.length; i++) {
            System.out.println("Name: " + arena.getHeros()[i].getName() + " | HP: " + arena.getHeros()[i].getHealth());
        }

    }

}
