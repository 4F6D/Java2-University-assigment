package Fiends;

import Game.GameObject;
import Hero.Hero;

public class Golem extends Fiend {
    public Golem(int health) {
        super(health);
    }

    @Override
    public void attack(GameObject f) {
        f.sustainDamage(10);
    }

    @Override
    public void sustainDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
    }
}
