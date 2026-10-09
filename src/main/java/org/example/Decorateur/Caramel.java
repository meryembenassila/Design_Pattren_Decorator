package org.example.Decorateur;

import org.example.Composants.Boisson;

public class Caramel extends Decorator{

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDesription() {
        return boisson.getDesription()+" + Caramel ";
    }

    @Override
    public double cout() {
        return boisson.cout() +0.5 ;
    }
}
