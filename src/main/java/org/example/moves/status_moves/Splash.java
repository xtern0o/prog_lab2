package org.example.moves.status_moves;

import ru.ifmo.se.pokemon.*;

public final class Splash extends StatusMove {
    public Splash() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe() {
        return "использует Splash (literally НИЧЕГО не происходит)";
    }
}
