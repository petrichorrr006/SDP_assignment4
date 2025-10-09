package SDP_assignment4;

public class QRPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "$" + " with QR Code");
    }
}
