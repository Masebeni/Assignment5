package masebeni.question3.SoftwareDesignPrinciples.plk.Violated;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class Female implements Person
{
    private  String name;
    private PreviousAge age;

    public Female(String nm, int years)
    {
        name=nm;
        age=  new PreviousAge(years);
    }
    public String getName() {
        return name;
    }

    public PreviousAge getPreviousAge(){
        return age;
    }

}
