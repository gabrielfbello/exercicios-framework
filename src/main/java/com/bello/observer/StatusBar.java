package com.bello.observer;

public class StatusBar implements Observer {
    @Override
    public void update(String stockSymbol, double price) {
        // Aqui, por simplicidade, mostramos todas as ações, mas você pode adaptar para mostrar apenas ações "preferidas".
        System.out.println("[StatusBar] Preço da ação " + stockSymbol + " atualizado para: " + price);
    }
}

