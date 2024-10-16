package org.example.moves.status_moves;

import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove {
    public Roost() {
        super(Type.FLYING, 0, 0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pAtt, Pokemon pDef) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, -(int) p.getStat(Stat.HP) / 2);
        // p.addEffect(new Effect().stat(Stat.HP, -(int) p.getStat(Stat.HP) / 2));
        // idk how to change type for 1 turn because Pokemon.setType is protected
    }

    @Override
    protected String describe() {
        return "использует Roost";
    }
}
