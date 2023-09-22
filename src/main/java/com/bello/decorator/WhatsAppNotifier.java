package com.bello.decorator;

public class WhatsAppNotifier extends NotifierDecorator {
    public WhatsAppNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
        System.out.println("Enviando WhatsApp: " + message);
    }
}
