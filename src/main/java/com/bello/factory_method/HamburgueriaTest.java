package com.bello.factory_method;

public class HamburgueriaTest {
    public static void main(String[] args) {
        HamburguerFactory angusFactory = new AngusFactory();
        Hamburguer angus = angusFactory.criarHamburguer();
        System.out.println(angus.getNome() + " com ingredientes: " + String.join(", ", angus.getIngredientes()));

        HamburguerFactory veganoFactory = new VeganoFactory();
        Hamburguer vegano = veganoFactory.criarHamburguer();
        System.out.println(vegano.getNome() + " com ingredientes: " + String.join(", ", vegano.getIngredientes()));
    }
}
