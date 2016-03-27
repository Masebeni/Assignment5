package masebeni.question3.SoftwareDesignPrinciples.plk.Corrected;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class Male implements Person
{
    private String name;
    private PreviousAge age;

    public Male(String nam, int years)
    {
        name=nam;
        age= new PreviousAge(years);
    }
    public String getName()
    {
        return name;
    }

    public int getAge() {
        return age.getPreviousAge();
    }

}
