package com.bello.strategy;

public class PagamentoPaypal implements FormaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando " + valor + " via PayPal.");
    }
}
