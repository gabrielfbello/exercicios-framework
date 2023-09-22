package com.bello.observer;

public class StockListView implements Observer {
    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("[StockListView] Preço da ação " + stockSymbol + " atualizado para: " + price);
    }
}
