package Hero;

import Game.GameObject;

public abstract class Hero extends GameObject {
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

}
