package com.bello.factory_method;

public class VeganoFactory extends HamburguerFactory {
    @Override
    public Hamburguer criarHamburguer() {
        return new HamburguerVegano();
    }
}
