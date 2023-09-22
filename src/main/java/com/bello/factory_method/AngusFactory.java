package com.bello.factory_method;

public class AngusFactory extends HamburguerFactory {
    @Override
    public Hamburguer criarHamburguer() {
        return new HamburguerAngus();
    }
}

