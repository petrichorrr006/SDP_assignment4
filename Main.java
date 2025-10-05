package SDP_assignment4;

public class Main {
    public static void main(String[] args) {
        Payment online = new OnlinePayment(new CardPayment());
        Payment offline = new OfflinePayment(new CardPayment());

        online.makePayment(1500.0);
        offline.makePayment(500.0);
    }
}
