package Hero;

import Fiends.Fiend;
import Game.GameObject;

public class Paladin extends Hero {
    // Konstruktor
    public Paladin(String name, int health) {
        super(name, health);
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
