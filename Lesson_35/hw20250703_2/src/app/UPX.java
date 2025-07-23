package app;

public class UPX implements MailDeliveryService {
    @Override
    public void sendMail() {
        System.out.println("Заказали курьера, отправили");
    }

    @Override
    public String name() {
        return "UPX";
    }
}
