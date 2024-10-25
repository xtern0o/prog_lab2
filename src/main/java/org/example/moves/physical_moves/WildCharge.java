package org.example.moves.physical_moves;

import ru.ifmo.se.pokemon.*;

public final class WildCharge extends PhysicalMove {
    public WildCharge() {
        super(Type.ELECTRIC, 90, 100);
    }
    // gen5

    @Override
    protected void applySelfDamage(Pokemon p, double damage) {
        p.setMod(Stat.HP, (int) (damage / 4));
    }

    @Override
    protected String describe() {
        return "использует Wild Charge";
    }
}
