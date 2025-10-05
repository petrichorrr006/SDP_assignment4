package SDP_assignment4;

public class CardPayment implements PaymentMethod{
    public void pay(double amount) {
        System.out.println("Paid " + amount + "$" + " with card");
    }
}
