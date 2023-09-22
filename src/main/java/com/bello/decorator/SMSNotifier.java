package com.bello.decorator;

public class SMSNotifier extends NotifierDecorator {
    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
        System.out.println("Enviando SMS: " + message);
    }
}

