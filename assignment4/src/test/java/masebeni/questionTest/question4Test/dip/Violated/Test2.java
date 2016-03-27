package masebeni.questionTest.question4Test.dip.Violated;

import masebeni.question3.SoftwareDesignPrinciples.dip.Violated.Word;
import org.junit.Assert;
import org.junit.Before;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class Test2 {
    private Word talk;

    @Before
    public void setUp() throws Exception
    {
        talk = new Word();
    }
    @org.junit.Test
    public void testName() throws Exception {
        Assert.assertEquals("TP2",talk.getWord());
    }

}