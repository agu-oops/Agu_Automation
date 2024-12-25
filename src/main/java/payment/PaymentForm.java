package payment;

public class PaymentForm {
    public static String processPayment(String method, double amount, String details) {
        if (details.isEmpty()) throw new IllegalArgumentException("Payment details missing");
        return "Processing $" + amount + " via " + method;
    }

    public static void main(String[] args) {
        System.out.println(processPayment("credit card", 100.0, "1234-5678-9876-5432"));
        System.out.println(processPayment("paypal", 50.0, "example@paypal.com"));
    }
}
