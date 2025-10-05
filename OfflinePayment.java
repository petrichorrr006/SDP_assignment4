package SDP_assignment4;

class OfflinePayment extends Payment {
    public OfflinePayment(PaymentMethod method) {
        super(method);
    }

    public void makePayment(double amount) {
        System.out.print("Offline payment: ");
        method.pay(amount);
    }
}
