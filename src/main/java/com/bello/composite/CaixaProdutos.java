package com.bello.composite;

import java.util.ArrayList;
import java.util.List;

public class CaixaProdutos implements ProdutoComponente {
    private List<ProdutoComponente> produtos;

    public CaixaProdutos() {
        produtos = new ArrayList<>();
    }

    public void adicionar(ProdutoComponente produto) {
        produtos.add(produto);
    }

    public void remover(ProdutoComponente produto) {
        produtos.remove(produto);
    }

    @Override
    public double getPreco() {
        return produtos.stream().mapToDouble(ProdutoComponente::getPreco).sum();
    }
}

