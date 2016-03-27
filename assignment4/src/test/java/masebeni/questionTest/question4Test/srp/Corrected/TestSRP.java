package masebeni.questionTest.question4Test.srp.Corrected;

import masebeni.question3.SoftwareDesignPrinciples.srp.Corrected.BankServices;
import masebeni.question3.SoftwareDesignPrinciples.srp.Corrected.Services;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class TestSRP {
    private BankServices services;

    @Before
    public void setUp() throws Exception
    {
        services = new Services(5000);
    }

    @Test
    public void testSRPCorrected()
    {
        Assert.assertNotNull(services.withdrawal(500));
    }

}
