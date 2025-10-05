package SDP_assignment4;

class OnlinePayment extends Payment {
    public OnlinePayment(PaymentMethod method) {
        super(method);
    }

    public void makePayment(double amount) {
        System.out.print("Online payment: ");
        method.pay(amount);
    }
}
