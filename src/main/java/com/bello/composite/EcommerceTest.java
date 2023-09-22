package com.bello.composite;

public class EcommerceTest {
    public static void main(String[] args) {
        ProdutoComponente produto1 = new ProdutoIndividual(100.0);
        ProdutoComponente produto2 = new ProdutoIndividual(200.0);

        CaixaProdutos caixa = new CaixaProdutos();
        caixa.adicionar(produto1);
        caixa.adicionar(produto2);

        ProdutoComponente produto3 = new ProdutoIndividual(150.0);
        CaixaProdutos caixaGrande = new CaixaProdutos();
        caixaGrande.adicionar(produto3);
        caixaGrande.adicionar(caixa);

        System.out.println("Preço da caixa pequena: " + caixa.getPreco());
        System.out.println("Preço da caixa grande: " + caixaGrande.getPreco());
    }
}

