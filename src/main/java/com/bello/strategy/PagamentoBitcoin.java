package com.bello.strategy;

public class PagamentoBitcoin implements FormaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando " + valor + " com Bitcoin.");
    }
}
