package org.example.moves.status_moves;

import ru.ifmo.se.pokemon.*;

public final class Splash extends StatusMove {
    public Splash() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pAtt, Pokemon pDef) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует Splash (НИЧЕГО не происходит)";
    }
}
