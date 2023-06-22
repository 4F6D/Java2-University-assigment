package Fiends;

import Game.GameObject;
import Hero.Hero;

public class Spider extends Fiend {
    // Konstruktoren
    public Spider(int health) {
        super(health);
    }

    @Override
    public void attack(GameObject f) {
        f.sustainDamage(10);
        logAction("Fiend: " + this.getClass() + " attacks Hero " + ((Hero) f).getName() + " Health: " + ((Hero) f).getHealth());
    }

    @Override
    public void sustainDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
    }
}
