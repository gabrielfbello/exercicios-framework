package com.bello.strategy;

public class DeliveryAppPagamentoTest {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.setFormaPagamento(new PagamentoDinheiro());
        pedido.finalizarPedido(100.00);

        pedido.setFormaPagamento(new PagamentoCartaoCredito());
        pedido.finalizarPedido(150.00);

        pedido.setFormaPagamento(new PagamentoPaypal());
        pedido.finalizarPedido(50.00);

        pedido.setFormaPagamento(new PagamentoBitcoin());
        pedido.finalizarPedido(75.00);
    }
}

