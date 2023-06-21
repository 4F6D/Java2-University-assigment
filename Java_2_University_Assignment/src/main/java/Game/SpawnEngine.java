package Game;

import Fiends.Fiend;
import Fiends.Spider;

public class SpawnEngine {

    // Klassenmethoden
    public Fiend spawn() {
        return new Spider(10);
    }
}
