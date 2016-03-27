package masebeni.question3.SoftwareDesignPrinciples.isp.Violated;

import masebeni.question3.SoftwareDesignPrinciples.isp.Corrected.Lecturer;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class Administrator implements Lecturer, Person {
    public Boolean lectures() {
        return true;
    }
    public Boolean administrates() {
        return false;
    }
}
