package Hero;

import Fiends.Fiend;
import Game.Game.*;
import Game.GameObject;

public class Knight extends Hero {
    // Konstruktor
    public Knight(String name, int health) {
        super(name, health);
    }

    public void attack(GameObject f) {
        f.sustainDamage(10);
        logAction("Hero: " + getName() + " attacks Fiend " + f.getClass() + " Health: " + ((Fiend) f).getHealth());
    }

    @Override
    public void sustainDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
    }
}
