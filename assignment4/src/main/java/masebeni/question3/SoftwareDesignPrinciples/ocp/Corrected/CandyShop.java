package masebeni.question3.SoftwareDesignPrinciples.ocp.Corrected;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class CandyShop {
    private Purchase purchase;
    public CandyShop()
    {
        purchase = new Purchases();
    }

    public double purchaseCandy(String candy)
    {
        return purchase.purchaseCandy(candy);
    }

}