package com.bello.composite;

public class ProdutoIndividual implements ProdutoComponente {
    private double preco;

    public ProdutoIndividual(double preco) {
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
