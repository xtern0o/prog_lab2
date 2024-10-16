package org.example.pokemons;

import org.example.moves.physical_moves.*;
import org.example.moves.special_moves.*;
import org.example.moves.status_moves.*;
import ru.ifmo.se.pokemon.*;

public class Mantyke extends Pokemon {
    public Mantyke(String name, int level) {
        super(name, level);
        this.setStats(45, 20, 50, 60, 120, 50);
        this.setType(Type.WATER, Type.FLYING);
        this.setMove(new RockSlide(), new SignalBeam(), new Rest());
    }
}
