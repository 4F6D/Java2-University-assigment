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
    }

    @Override
    public void sustainDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
    }
}
