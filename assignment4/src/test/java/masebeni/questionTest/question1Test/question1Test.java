package masebeni.questionTest.question1Test;

import junit.framework.Assert;
import masebeni.question1.RunAnimal;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class question1Test {
    RunAnimal runAnimal = new RunAnimal();
    @Test
    public void testAnimal() throws Exception {
        Assert.assertTrue(runAnimal.testAnimal().getSound().equalsIgnoreCase("bark"));
    }

}
