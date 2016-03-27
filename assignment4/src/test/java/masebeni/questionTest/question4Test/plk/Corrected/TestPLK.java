package masebeni.questionTest.question4Test.plk.Corrected;

import masebeni.question3.SoftwareDesignPrinciples.plk.Corrected.Male;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class TestPLK {
    private Male oldInfo;

    @Before
    public void setUp() throws Exception {
        oldInfo = new Male("", 12);
    }
    @Test
    public void testPLKViolated() throws Exception
    {
        Assert.assertEquals(12, oldInfo.getAge());
    }
}
