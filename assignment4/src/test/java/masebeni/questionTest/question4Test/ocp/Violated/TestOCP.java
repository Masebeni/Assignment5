package masebeni.questionTest.question4Test.ocp.Violated;

import masebeni.question3.SoftwareDesignPrinciples.ocp.Violated.CandyShop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class TestOCP {

    private CandyShop buy;

    @Before
    public void setUp() throws Exception
    {
        buy = new CandyShop();
    }

    @Test
    public void testOCPCorrected()
    {
        Assert.assertEquals(buy.buyChocolate(),10,5);
    }

}
