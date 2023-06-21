package Game;

import Fiends.Fiend;
import Hero.Hero;

public class Game {
    protected Arena arena;

    // Konstruktoren
    public Game(Arena arena) {
        this.arena = arena;
    }

    public void iterate() {
        int heroCount = arena.getHeros().length;
        int enemyCount = arena.getFiends().length;
        Die fiendDie = new Die(enemyCount);
        Die heroDie = new Die(heroCount);

        Fiend[] fiends = arena.getFiends();
        Hero[] heros = arena.getHeros();

        for(Hero e : heros) {
            int result = fiendDie.throwDie()-1;
            e.attack(fiends[result]);
            System.out.println("Hero: " + e.getName() + " attacks Fiend " + result + " Health: " + fiends[result].getHealth());
        }

        for(Fiend f : fiends) {
            int result = heroDie.throwDie()-1;
            f.attack(heros[result]);
            System.out.println("Enemy attacks " + heros[result].getName() + " Health: " + heros[result].getHealth());
        }
    }
}
