package com.bello.decorator;

public class DeliveryAppTest {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier.send("Pedido recebido!");

        Notifier smsNotifier = new SMSNotifier(new EmailNotifier());
        smsNotifier.send("Saiu para entrega!");

        Notifier whatsappAndSMSNotifier = new WhatsAppNotifier(new SMSNotifier(new EmailNotifier()));
        whatsappAndSMSNotifier.send("Pagamento efetuado!");
    }
}
