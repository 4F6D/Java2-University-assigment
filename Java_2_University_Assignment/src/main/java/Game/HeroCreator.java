package Game;

import Hero.Hero;
import Hero.Knight;
import Hero.Mage;
import Hero.Paladin;

public class HeroCreator {
    public static Hero[] createHeroes() {
        Hero[] heros = new Hero[3];

        heros[0] = new Paladin("Rene", 100);
        heros[1] = new Knight("Tricia", 80);
        heros[2] = new Mage("Tarek", 40);

        return heros;
    }
}
