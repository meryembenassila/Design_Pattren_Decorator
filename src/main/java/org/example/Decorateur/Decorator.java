package org.example.Decorateur;

import org.example.Composants.Boisson;

public abstract class Decorator extends Boisson {
    protected Boisson boisson ;
    public Decorator(Boisson boisson){
        this.boisson =boisson;
    }
}
