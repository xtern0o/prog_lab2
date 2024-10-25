package org.example.pokemons;

import org.example.moves.status_moves.*;

public final class Tsareena extends Steene {
    public Tsareena(String name, int level) {
        super(name, level);
        this.addMove(new SweetScent());
    }
}
