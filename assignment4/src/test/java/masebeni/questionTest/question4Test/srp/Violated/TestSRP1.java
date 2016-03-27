package masebeni.questionTest.question4Test.srp.Violated;

import masebeni.question3.SoftwareDesignPrinciples.srp.Violated.BankServices;
import masebeni.question3.SoftwareDesignPrinciples.srp.Violated.Services;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class TestSRP1 {

    private BankServices services;

    @Before
    public void setUp() throws Exception
    {
        services = new Services();
    }

    @Test
    public void testSRPViolated()
    {
        Assert.assertNotNull(services.buyHouse(250000));
    }

}
