package org.example.pokemons;

import org.example.moves.physical_moves.*;
import org.example.moves.status_moves.*;
import ru.ifmo.se.pokemon.*;

public final class Emolga extends Pokemon {
    public Emolga(String name, int level) {
        super(name, level);
        this.setStats(55, 75, 60, 75, 60, 103);
        this.setType(Type.ELECTRIC, Type.FLYING);
        this.setMove(new IronTail(), new ThunderWave(), new Tickle(), new WildCharge());
    }

}
