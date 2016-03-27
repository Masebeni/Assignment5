package masebeni.question3.SoftwareDesignPrinciples.ocp.Corrected;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class Purchases implements Purchase {

    public double purchaseCandy(String candy) {
        if(candy.equalsIgnoreCase("Lolly Pop"))
            return 2.3;
        else if (candy.equalsIgnoreCase("Chocolate"))
            return 10.0;
        else
        return 5.5;
    }
}
