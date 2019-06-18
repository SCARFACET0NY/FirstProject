package chain_of_responsibility;

public abstract class Payment {
    public static double STANDARD_RATE = 0.2;
    public static double PREFERENTIAL_RATE = 0.1;
    public static double GOVERNMENT_RATE = 0.05;
    public static double INTERNAL_RATE = 0;

    private Payment nexPayment;
    protected double rate;
    private double total;

    public void setNexPayment(Payment nexPayment) {
        this.nexPayment = nexPayment;
    }

    public double execute(double amount) {
        total = calculate(amount);

        if (nexPayment != null) {
            total += nexPayment.execute(amount);
        }

        return total;
    }

    abstract double calculate(double amount);
}
