package chain_of_responsibility;

public class InternalPayment extends Payment {
    public InternalPayment(double rate) {
        this.rate = rate;
    }

    @Override
    double calculate(double amount) {
        System.out.println("Internal commission: " + amount * rate);
        return amount * rate;
    }
}
