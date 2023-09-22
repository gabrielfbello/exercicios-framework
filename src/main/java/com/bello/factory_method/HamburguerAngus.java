package com.bello.factory_method;

public class HamburguerAngus implements Hamburguer {
    private String nome = "Hambúrguer Angus";
    private String[] ingredientes = {"Carne Angus", "Queijo Cheddar", "Molho Especial"};

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String[] getIngredientes() {
        return ingredientes;
    }
}

