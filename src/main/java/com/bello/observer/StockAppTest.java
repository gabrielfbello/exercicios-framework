package com.bello.observer;

public class StockAppTest {
    public static void main(String[] args) {
        Stock stock = new Stock();

        StatusBar statusBar = new StatusBar();
        StockListView stockListView = new StockListView();

        stock.registerObserver(statusBar);
        stock.registerObserver(stockListView);

        stock.setStockPrice("AAPL", 150.00);
        stock.setStockPrice("GOOGL", 2800.00);
    }
}

