package masebeni.questionTest.question4Test.isp.Violated;

import masebeni.question3.SoftwareDesignPrinciples.isp.Violated.Administrator;
import masebeni.question3.SoftwareDesignPrinciples.isp.Violated.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class Test4 {

    private Person axe;

    @Before
    public void setUp() throws Exception
    {
        axe = new Administrator();
    }

    @Test
    public void testISP() throws Exception {
        Assert.assertFalse(axe.lectures());
    }
}