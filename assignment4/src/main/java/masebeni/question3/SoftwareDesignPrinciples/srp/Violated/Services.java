package masebeni.question3.SoftwareDesignPrinciples.srp.Violated;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class Services implements BankServices {

    public void deposit()
    { }

    public void withdraw() {

    }

    public double buyHouse(double amount)
    {
        if (amount > 55000)
            return amount/55000;
        else
            return 0;
    }
}
