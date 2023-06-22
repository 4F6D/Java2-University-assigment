package Hero;

import Fiends.Fiend;
import Game.GameObject;

public class Mage extends Hero {
    // Konstruktor
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(GameObject f) {
        f.sustainDamage(10);
        logAction("Hero: " + getName() + " attacks fiend " + f.getClass() + " Health: " + ((Fiend) f).getHealth());
    }

    @Override
    public void sustainDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
    }
}
