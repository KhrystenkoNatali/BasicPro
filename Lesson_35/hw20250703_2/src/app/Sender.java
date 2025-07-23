package app;

public class Sender {
    private MailDeliveryService service;

    public Sender(MailDeliveryService service) {
        this.service = service;
    }

    public void send(){
        service.sendMail();
    }
}
