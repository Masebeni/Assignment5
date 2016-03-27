package masebeni.questionTest.question4Test.ocp.Corrected;

import masebeni.question3.SoftwareDesignPrinciples.ocp.Corrected.CandyShop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class TestOCP1 {
    private CandyShop buy;

    @Before
    public void setUp() throws Exception
    {
        buy = new CandyShop();
    }

    @Test
    public void testOCPCorrected()
    {
        Assert.assertEquals(buy.purchaseCandy("Lolly Pop"),2,3);
    }

}
