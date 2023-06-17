package com.example.java_2_university_assignment;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main {

    public static void main(String[] args) {

        // Helden generieren
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero("Rey", 20);
        heroes[1] = new Hero("Kaitlyn", 10);
        heroes[2] = new Hero("Darren", 30);

        // Instanz von Arena anlegen
        Arena arena = new Arena(heroes);

        // Übersicht aller Helden ausgeben
        for(int i = 0; i < heroes.length; i++) {
            System.out.println("Name: " + arena.getHeros()[i].getName() + " | HP: " + arena.getHeros()[i].getHealth());
        }

    }

}
