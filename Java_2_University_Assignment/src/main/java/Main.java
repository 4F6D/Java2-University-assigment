import Fiends.Demon;
import Fiends.Fiend;
import Fiends.Golem;
import Fiends.Spider;
import Game.Arena;
import Hero.Hero;
import Hero.Knight;
import Hero.Mage;
import Hero.Paladin;
import Game.Game;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        // IO text output
        PrintWriter p = new PrintWriter(new FileWriter("HistoryLog.txt"));

        // Helden generieren
        Hero[] heroes = new Hero[3];
        heroes[0] = new Knight("Rey", 20);
        heroes[1] = new Mage("Kaitlyn", 10);
        heroes[2] = new Paladin("Darren", 30);

        heroes[1].setHealth(-20);

        // Gegner generieren
        Fiend[] fiends = new Fiend[3];
        fiends[0] = new Spider(20);
        fiends[1] = new Golem(20);
        fiends[2] = new Demon(20);

        // Instanz von Arena anlegen
        Arena arena = new Arena(heroes, fiends);

        Game game = new Game(arena);
        game.iterate();
        game.iterate();

        // Log-Daten
        for(Fiend f : fiends) {
            f.print();
            p.println(f.save());
        }

        for(Hero h : heroes) {
            h.print();
            p.println(h.save());
        }

        p.close();
    }
}
