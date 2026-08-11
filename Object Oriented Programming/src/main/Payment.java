


package composition;

import java.time.LocalDate;

public class Payment {

    private double amount;
    private LocalDate paymentDate;
    private String paymentMethod;
    private String paymentType;

    public Payment(double amount, LocalDate paymentDate,
                   String paymentMethod, String paymentType) {

        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.paymentType = paymentType;
    }

    public void displayPaymentDetails() {
        System.out.println("Payment Details");
        System.out.println("-------------------------");
        System.out.println("Payment Amount: " + amount);
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Payment Type: " + paymentType);
    }
}