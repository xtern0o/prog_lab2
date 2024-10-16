package org.example.pokemons;

import org.example.moves.status_moves.*;
import ru.ifmo.se.pokemon.*;

public class Steene extends Bounsweet {
    public Steene(String name, int level) {
        super(name, level);
        this.addMove(new PlayNice());
    }
}
