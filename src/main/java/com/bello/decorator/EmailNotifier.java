package com.bello.decorator;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Enviando email: " + message);
    }
}
