package masebeni.question3.SoftwareDesignPrinciples.lsk.Violated;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class Move extends Vehicle {
    @Override
    public Boolean drive() throws UnsupportedOperationException{
        return false;
    }
}
