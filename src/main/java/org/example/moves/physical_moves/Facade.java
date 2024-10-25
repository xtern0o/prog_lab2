package org.example.moves.physical_moves;

import ru.ifmo.se.pokemon.*;

public final class Facade extends PhysicalMove {
    private boolean isCritical = false;

    public Facade() {
        super(Type.NORMAL, 70, 100);
    }
    // gen3

    @Override
    protected double calcCriticalHit(Pokemon pAtt, Pokemon pDef) {
        if (pAtt.getCondition().equals(Status.BURN) || pAtt.getCondition().equals(Status.POISON) || pAtt.getCondition().equals(Status.PARALYZE)) {
            isCritical = true;
            return 2.0;
        }
        else return super.calcCriticalHit(pAtt, pDef);
    }

    @Override
    protected String describe() {
        return isCritical ? "использует Facade и наносит двойной урон" : "использует Facade";
    }
}
