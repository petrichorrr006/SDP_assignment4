package SDP_assignment4;

abstract class Payment {
    protected PaymentMethod method;
    protected Payment(PaymentMethod method) {
        this.method = method;
    }
    abstract void makePayment(double amount);
}
