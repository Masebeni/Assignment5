package masebeni.questionTest.question4Test.lsk.Corrected;

import masebeni.question3.SoftwareDesignPrinciples.lsk.Corrected.Car;
import masebeni.question3.SoftwareDesignPrinciples.lsk.Corrected.Vehicle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class TestLSK {

    private Vehicle trans;

    @Before
    public void setUp() throws Exception
    {
        trans = new Car();
    }

    @Test
    public void testLSPCorrected() throws Exception
    {
        Assert.assertTrue(trans.drive());
    }

}
