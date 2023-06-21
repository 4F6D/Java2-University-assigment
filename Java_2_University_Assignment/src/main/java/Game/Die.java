package Game;

import java.util.Random;

public class Die {
    // Klassenattribute
    protected int sides;

    // Konstruktoren
    public Die(int sides) {
        this.sides = sides;
    }

    // Klassenmethoden
    public int throwDie() {
        Random r = new Random();
        return r.nextInt(sides) + 1;
    }
}
