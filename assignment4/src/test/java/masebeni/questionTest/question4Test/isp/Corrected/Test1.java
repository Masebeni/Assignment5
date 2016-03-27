package masebeni.questionTest.question4Test.isp.Corrected;

import masebeni.question3.SoftwareDesignPrinciples.isp.Corrected.Lecturer;
import masebeni.question3.SoftwareDesignPrinciples.isp.Corrected.Lecturers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class Test1 {
    private Lecturer lecturer;

    @Before
    public void setUp() throws Exception
    {
        lecturer = new Lecturers();
    }

    @Test
    public void testISPCorrected() throws Exception
    {
        Assert.assertTrue(lecturer.lectures());
    }
}
