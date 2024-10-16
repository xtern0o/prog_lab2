package org.example;

import org.example.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Emolga("max", 50);
        Pokemon p2 = new Mantine("karn", 50);
        Pokemon p3 = new Mantyke("maven", 40);
        Pokemon p4 = new Steene("org.apache.maven.plugins", 40);
        Pokemon p5 = new Bounsweet("java", 30);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addFoe(p3);
        b.addFoe(p4);
        b.addFoe(p5);

        b.go();
    }
}
