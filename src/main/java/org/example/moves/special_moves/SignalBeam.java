package org.example.moves.special_moves;

import ru.ifmo.se.pokemon.*;

public final class SignalBeam extends SpecialMove {
    public SignalBeam() {
        super(Type.BUG, 75, 100);
    }
    // gen3

    @Override
    public void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) p.confuse();
    }

    @Override
    protected String describe() {
        return "использует Signal Beam";
    }
}
