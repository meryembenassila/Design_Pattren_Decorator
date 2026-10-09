package org.example.Decorateur;

import org.example.Composants.Boisson;

public class Chocolat extends Decorator {

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDesription() {
        return boisson.getDesription()+" + Chocolat";
    }

    @Override
    public double cout() {
        return boisson.cout()+1;
    }
}
