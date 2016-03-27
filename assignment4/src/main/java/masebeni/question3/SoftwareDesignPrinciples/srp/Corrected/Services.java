package masebeni.question3.SoftwareDesignPrinciples.srp.Corrected;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class Services implements BankServices {

    private double amount;

    public Services(double cash)
    { amount = cash;}

    public double deposit(double deposit) {
        return amount += deposit;
    }

    public double withdrawal(double withdraw) {
        return amount-= withdraw;
    }
}
