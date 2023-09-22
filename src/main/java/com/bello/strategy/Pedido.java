package com.bello.strategy;

public class Pedido {
    private FormaPagamento formaPagamento;

    public Pedido() {}

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void finalizarPedido(double valor) {
        this.formaPagamento.pagar(valor);
    }
}
