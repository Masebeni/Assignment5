package masebeni.questionTest.question4Test.lsk.Violated;

import masebeni.question3.SoftwareDesignPrinciples.lsk.Violated.Vehicle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class TestLSK1 {


    private Vehicle trans;

    @Before
    public void setUp() throws Exception
    {
        trans = new Vehicle() {
            @Override
            public Boolean drive() {
                return true;
            }
        };
    }

    @Test
    public void testLSPCorrected() throws Exception
    {
        Assert.assertTrue(trans.drive());
    }
}
