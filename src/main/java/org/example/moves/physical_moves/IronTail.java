package org.example.moves.physical_moves;

import ru.ifmo.se.pokemon.*;

public class IronTail extends PhysicalMove {
    public IronTail() {
        super(Type.STEEL, 100, 75);
        // gen2
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.3).stat(Stat.DEFENSE, -1));
//        if (Math.random() <= 0.3) p.setMod(Stat.DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return "использует Iron Tail";
    }
}
