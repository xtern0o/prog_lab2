package org.example.moves.physical_moves;

import ru.ifmo.se.pokemon.*;

public final class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK, 75, 90);
    }
    // gen1

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) Effect.flinch(p);
    }

    @Override
    protected String describe() {
        return "использует Rock Slide";
    }
}
