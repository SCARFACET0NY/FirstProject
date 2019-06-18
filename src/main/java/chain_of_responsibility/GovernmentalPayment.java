package chain_of_responsibility;

public class GovernmentalPayment extends Payment {
    public GovernmentalPayment(double rate) {
        this.rate = rate;
    }

    @Override
    double calculate(double amount) {
        System.out.println("Governmental commission: " + amount * rate);
        return amount * rate;
    }
}
