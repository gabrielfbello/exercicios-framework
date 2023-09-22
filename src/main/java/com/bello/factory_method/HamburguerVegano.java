package com.bello.factory_method;

public class HamburguerVegano implements Hamburguer {
    private String nome = "Hambúrguer Vegano";
    private String[] ingredientes = {"Hambúrguer de Grão de Bico", "Alface", "Tomate"};

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String[] getIngredientes() {
        return ingredientes;
    }
}
