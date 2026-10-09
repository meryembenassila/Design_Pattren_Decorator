package org.example;

import org.example.Composants.Boisson;
import org.example.Composants.Espresso;
import org.example.Decorateur.Caramel;
import org.example.Decorateur.Chocolat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boisson b = new Espresso();
        System.out.println( b.getDesription());
        System.out.println( "Cout: " +b.cout());
        b = new Caramel(b);
        System.out.println( b.getDesription());
        System.out.println( "Cout: " +b.cout());
        b = new Chocolat(b);
        System.out.println( b.getDesription());
        System.out.println( "Cout: " +b.cout());

    }
}