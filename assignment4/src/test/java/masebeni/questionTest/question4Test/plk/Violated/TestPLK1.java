package masebeni.questionTest.question4Test.plk.Violated;

import masebeni.question3.SoftwareDesignPrinciples.plk.Violated.Female;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class TestPLK1 {

    private Female oldInfo;

    @Before
    public void setUp() throws Exception
    {
        oldInfo = new Female("Axe", 20);
    }

    @Test
    public void testPLKViolated() throws Exception
    {
        Assert.assertEquals(oldInfo.getName(),"Axe");
    }
}
