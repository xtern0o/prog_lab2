package org.example.pokemons;

import org.example.moves.physical_moves.*;
import org.example.moves.status_moves.*;
import ru.ifmo.se.pokemon.*;

public class Bounsweet extends Pokemon {
    public Bounsweet(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS);
        this.setStats(42, 30, 38, 30, 38, 32);
        this.setMove(new Facade(), new Splash());
    }
}
