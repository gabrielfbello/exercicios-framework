package com.bello.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stock implements Subject {
    private List<Observer> observers;
    private Map<String, Double> stockPrices;

    public Stock() {
        observers = new ArrayList<>();
        stockPrices = new HashMap<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        stockPrices.forEach((stock, price) -> {
            for (Observer observer : observers) {
                observer.update(stock, price);
            }
        });
    }

    public void setStockPrice(String stockSymbol, double price) {
        stockPrices.put(stockSymbol, price);
        notifyObservers();
    }
}

