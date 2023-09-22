package com.bello.strategy;

public class PagamentoCartaoCredito implements FormaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando " + valor + " com cartão de crédito.");
    }
}
