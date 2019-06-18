package chain_of_responsibility;

public class StandardPayment extends Payment {
    public StandardPayment(double rate) {
        this.rate = rate;
    }

    @Override
    double calculate(double amount) {
        System.out.println("Standard commission: " + amount * rate);
        return amount * rate;
    }
}
