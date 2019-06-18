package chain_of_responsibility;

public class PreferentialPayment extends Payment {
    public PreferentialPayment(double rate) {
        this.rate = rate;
    }

    @Override
    double calculate(double amount) {
        System.out.println("Preferential commission: " + amount * rate);
        return amount * rate;
    }
}
