package chain_of_responsibility;

public class BankClient {


    public static void main(String[] args) {
        Payment standardPayment = new StandardPayment(Payment.STANDARD_RATE);
        Payment preferentialPayment = new PreferentialPayment(Payment.PREFERENTIAL_RATE);
        Payment governmentalPayment = new GovernmentalPayment(Payment.GOVERNMENT_RATE);
        Payment internalPayment = new InternalPayment((Payment.INTERNAL_RATE));

        standardPayment.setNexPayment(preferentialPayment);
        preferentialPayment.setNexPayment(governmentalPayment);
        governmentalPayment.setNexPayment(internalPayment);

        System.out.println("Total commission: " + standardPayment.execute(100));
    }
}
