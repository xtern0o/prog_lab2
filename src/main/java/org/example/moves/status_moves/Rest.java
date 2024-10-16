package org.example.moves.status_moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }
    // gen1

    @Override
    protected boolean checkAccuracy(Pokemon pAtt, Pokemon pDef) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().turns(2).condition(Status.SLEEP));
        p.restore();
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}
