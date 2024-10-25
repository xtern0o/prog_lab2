package org.example.pokemons;

import org.example.moves.status_moves.*;

public final class Mantine extends Mantyke {
    public Mantine(String name, int level) {
        super(name, level);
        this.setStats(85, 40, 70, 80, 140, 70);
        this.addMove(new Roost());
    }
}
