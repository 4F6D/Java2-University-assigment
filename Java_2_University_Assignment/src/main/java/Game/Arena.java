package Game;

import Fiends.Fiend;
import Hero.Hero;

public class Arena {
    // Klassenattribute
    protected Hero[] heros;
    protected Fiend[] fiends;

    // Konstruktoren
    public Arena(Hero[] heros, Fiend[] fiends) {
        this.heros = heros;
        this.fiends = fiends;
    }

    // Setter

    // Getter
    public Hero[] getHeros() {
        return this.heros;
    }

    public Fiend[] getFiends() {
        return this.fiends;
    }
}
