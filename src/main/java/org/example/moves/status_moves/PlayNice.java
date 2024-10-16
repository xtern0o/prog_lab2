package org.example.moves.status_moves;

import ru.ifmo.se.pokemon.*;

public class PlayNice extends StatusMove {
    public PlayNice() {
        super(Type.NORMAL, 0, 0);
    }
    // gen6

    @Override
    protected boolean checkAccuracy(Pokemon pAtt, Pokemon pDef) {
        return true;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, -1);
    }

    @Override
    protected String describe() {
        return "использует Play Nice";
    }
}
