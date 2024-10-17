package org.example;

import org.example.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Emolga("max", 50);
        Pokemon p2 = new Mantine("karn", 50);
        Pokemon p3 = new Mantyke("maven", 50);
        Pokemon p4 = new Steene("org.apache.maven.plugins", 50);
        Pokemon p5 = new Bounsweet("java", 50);
        Pokemon p6 = new Tsareena("honor magicbook", 50);

        b.addAlly(p6);
        b.addAlly(p2);
        b.addAlly(p1);
        b.addFoe(p3);
        b.addFoe(p4);
        b.addFoe(p5);

        b.go();
    }
}
