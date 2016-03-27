package masebeni.questionTest.question4Test.dip.Corrected;

import masebeni.question3.SoftwareDesignPrinciples.dip.Corrected.Word;
import org.junit.Assert;
import org.junit.Before;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class Test1 {
    private Word talk;

    @Before

    public void setUp() throws Exception
    {
        talk = new Speak();
    }


    @org.junit.Test
    public void testName() throws Exception {
        Assert.assertEquals("Axe",talk.getWord("Axe"));
    }

    private class Speak implements Word {
        public String getWord(String word) {
            return word;
        }
    }
}
